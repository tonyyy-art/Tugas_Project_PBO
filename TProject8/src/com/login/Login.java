package com.login;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean login(String imputUsername, String inputPassword) {
        return username.equals(imputUsername) && password.equals(inputPassword);
    }

        
}
