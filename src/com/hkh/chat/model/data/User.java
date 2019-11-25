package com.hkh.chat.model.data;

public class User {

    private int uid = -1;
    private String username;


    public User(int uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public User() {

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
