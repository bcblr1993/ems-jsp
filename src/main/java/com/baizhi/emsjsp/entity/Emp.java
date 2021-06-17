package com.baizhi.emsjsp.entity;

import java.util.Date;

public class Emp {

    private Integer id;
    private String name;
    private Double salary;
    private Date birthday;
    private Boolean gender;

    public Emp() {
    }

    public Emp(Integer id, String name, Double salary, Date birthday, Boolean gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
