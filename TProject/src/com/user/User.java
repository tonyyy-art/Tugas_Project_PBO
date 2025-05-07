package com.user;

public abstract class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public abstract void loginMenu();
    public abstract void diplayMenu();
}
