package com.example.demo.model;

import java.util.List;

/**
 * Created by noba on 12/10/2017.
 */
public class Customer {

    private Integer id;
    private String pesel;
    private String name;
    private CustomerType customerType;
    private List<Account> accounts;

    public Customer() {
    }

    public Customer(Integer id, String pesel, String name, CustomerType customerType) {
        this.id = id;
        this.pesel = pesel;
        this.name = name;
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
