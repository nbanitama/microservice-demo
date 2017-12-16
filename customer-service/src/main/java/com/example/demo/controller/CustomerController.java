package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerType;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by noba on 12/10/2017.
 */
@RestController
public class CustomerController {

    @Autowired
    private AccountService accountClient;

    protected Logger logger = Logger.getLogger(CustomerController.class.getName());

    private List<Customer> customers;

    public CustomerController() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "12345", "Adam Kowalski", CustomerType.INDIVIDUAL));
        customers.add(new Customer(2, "12346", "Anna Malinowska", CustomerType.INDIVIDUAL));
        customers.add(new Customer(3, "12347", "Paweł Michalski", CustomerType.INDIVIDUAL));
        customers.add(new Customer(4, "12348", "Karolina Lewandowska", CustomerType.INDIVIDUAL));
    }

    @RequestMapping("/customers/pesel/{pesel}")
    public Customer findByPesel(@PathVariable("pesel") String pesel) {
        logger.info(String.format("Customer.findByPesel(%s)", pesel));
        return customers.stream().filter(it -> it.getPesel().equals(pesel)).findFirst().get();
    }

    @RequestMapping("/customers")
    public List<Customer> findAll() {
        logger.info("Customer.findAll()");
        return customers;
    }

    @RequestMapping("/customers/{id}")
    public Customer findById(@PathVariable("id") Integer id) {
        logger.info(String.format("Customer.findById(%s)", id));
        Customer customer = customers.stream().filter(it -> it.getId().intValue()==id.intValue()).findFirst().get();
        List<Account> accounts =  accountClient.getAccount(id);
        customer.setAccounts(accounts);
        return customer;
    }
}