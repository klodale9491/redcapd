package com.redcapd.metadatamanager.boundary;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class UserData {
    private long userId;
    private String userName;
    private String userRole;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
