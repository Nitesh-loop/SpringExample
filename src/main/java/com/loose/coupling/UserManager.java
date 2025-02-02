package com.loose.coupling;

public class UserManager {

    private UserDataProvider userDataProvider; //class member, of an interface

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
