package com.example.sharpner;

public class ProfileUser {
    private String name, email;

    public ProfileUser(){}
    public ProfileUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String gettName() {
        return name;
    }

    public void settName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
