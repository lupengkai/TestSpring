package com.tage.registration.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tage.registration.model.User;
import com.tage.registration.service.UserManager;
import com.tage.registration.service.impl.UserManagerImpl;

/**
 * Created by tage on 4/1/16.
 */
public class UserAction extends ActionSupport {


    private UserManager userManager = new UserManagerImpl();

    private String username;
    private String passeword;
    private String password2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasseword() {
        return passeword;
    }

    public void setPasseword(String passeword) {
        this.passeword = passeword;
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

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passeword);
        if (userManager.exists(user)) {
            return "fail";
        } else {
            userManager.add(user);
            return SUCCESS;
        }

    }
}
