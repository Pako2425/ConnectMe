package com.connectme.connectme.model;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private String dateOfRegistration;

    public User(long id, String username, String email, String password, String dateOfRegistration) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }
}
