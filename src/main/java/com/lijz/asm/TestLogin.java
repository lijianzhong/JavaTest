package com.lijz.asm;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class TestLogin {

    protected String userName;

    public TestLogin(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void login(){
        System.out.println("login method");
    }

}
