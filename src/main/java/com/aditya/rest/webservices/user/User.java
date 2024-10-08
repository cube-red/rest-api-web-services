package com.aditya.rest.webservices.user;

import java.time.LocalDate;

public class User {

    private Integer id;
    private String name;
    private LocalDate date;

    public User(Integer id, String name, LocalDate date) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
