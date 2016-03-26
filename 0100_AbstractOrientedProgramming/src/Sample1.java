import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.util.List;

/**
 * Created by tage on 3/26/16.
 */
public class Sample1 {




    public static void main(String[] args) throws Exception{
        SAXBuilder saxBuilder = new SAXBuilder();
        Document doc = saxBuilder.build(Sample1.class.getClassLoader().getResourceAsStream("test.xml"));

       Element rootElement =  doc.getRootElement();
        List<Element> list = rootElement.getChildren("disk");
        for (Element element : list) {
            String name = element.getAttributeValue("name");
            String capacity = element.getChildText("capacity");
            String directories = element.getChildText("directories");
            String files = element.getChildText("files");

            System.out.println("Disk: " + name);
            System.out.println("Capacity: " + capacity);
            System.out.println("Directories:  " + directories);
            System.out.println("Files: " + files);

        }

    }
}
