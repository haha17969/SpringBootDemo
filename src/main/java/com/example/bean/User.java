package com.example.bean;

public class User {
    private int id;
    private String username;
    private String password;


    private String signature;



    public User() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setId(int id) {
        this.id = id;
    }
}
