package com.tage.registration.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tage.registration.model.User;
import com.tage.registration.service.UserManager;
import com.tage.registration.service.impl.UserManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by tage on 4/1/16.
 */
@Component("user")//bean 对象 对应 package 里的action初始化
@Scope(value = "prototype")
public class UserAction extends ActionSupport {

    private UserManager userManager;
    private String username;
    private String password;
    private String password2;

    public UserAction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        userManager = (UserManager) applicationContext.getBean("userManager");

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasseword() {
        return password;
    }

    public void setPasseword(String passeword) {
        this.password = passeword;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    @Resource
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if (userManager.exists(user)) {
            return "fail";
        } else {
            userManager.add(user);
            return SUCCESS;
        }

    }
}
