package com.tage.spring;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tage on 3/26/16.
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    private Map<String, Object> beans = new HashMap<>();


    public ClassPathXmlApplicationContext() throws Exception {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document doc = saxBuilder.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));

        Element rootElement = doc.getRootElement();
        List<Element> list = rootElement.getChildren("bean");



        for (Element element : list) {
            String id = element.getAttributeValue("id");
            String clazz = element.getAttributeValue("class");
            System.out.println(clazz);



            Object o = Class.forName(clazz).newInstance();
            beans.put(id, o);

            for (Element propertyElement : (List<Element>)element.getChildren("property")) {
                String name = propertyElement.getAttributeValue("name");
                String bean = propertyElement.getAttributeValue("bean");

                Object beanObject = beans.get(bean);

                String methodName = "set" + name.substring(0,1).toUpperCase() + name.substring(1);


                Method m = o.getClass().getMethod(methodName, beanObject.getClass().getInterfaces()[0]);
                m.invoke(o,beanObject);


            }






        }









    }


    @Override
    public Object getBean(String name) {
        return beans.get(name);
    }
}
