package com.tage.registration.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tage.registration.model.User;
import com.tage.registration.service.UserManager;
import com.tage.registration.service.impl.UserManagerImpl;
import com.tage.registration.vo.UserRegisterInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by tage on 4/1/16.
 */
//可以不写@component
/*@Scope(value = "prototype")*/ //默认prototype
public class UserAction extends ActionSupport implements ModelDriven {
    private UserRegisterInfo userRegisterInfo = new UserRegisterInfo();
    private UserManager userManager;


    public UserAction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        userManager = (UserManager) applicationContext.getBean("userManager");

    }

    @Override
    public Object getModel() {
        return userRegisterInfo;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    /*@Resource*///可以不写
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUsername(userRegisterInfo.getUsername());
        user.setPassword(userRegisterInfo.getPassword());
        if (userManager.exists(user)) {
            return "fail";
        } else {
            userManager.add(user);
            return SUCCESS;
        }

    }
}
