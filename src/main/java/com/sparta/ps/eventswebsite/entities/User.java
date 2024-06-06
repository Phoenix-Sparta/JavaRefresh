package com.sparta.ps.eventswebsite.entities;

public class User {

    private int id;
    private int username;
    private String password;

    public User(int id, int username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getID(){
        return id;
    }

    public int setID(int id){
        this.id = id;
    }

}
