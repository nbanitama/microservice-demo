package com.example.demo.model;

/**
 * Created by noba on 12/10/2017.
 */
public class Account {

    private Integer id;
    private String number;

    public Account() {
    }

    public Account(Integer id, String number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
