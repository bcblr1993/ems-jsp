package com.baizhi.emsjsp.entity;

public class User {

    private Integer id;
    private String  username;
    private String  realname;
    private String  password;
    private Boolean gender;

    public User() {
    }

    public User(Integer id, String username, String realname, String password, boolean gender) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
