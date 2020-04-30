package com.ly1240.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double moeny;

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

    public Double getMoeny() {
        return moeny;
    }

    public void setMoeny(Double moeny) {
        this.moeny = moeny;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", moeny=" + moeny +
                '}';
    }
}
