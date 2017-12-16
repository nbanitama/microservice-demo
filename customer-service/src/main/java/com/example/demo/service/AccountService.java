package com.example.demo.service;

import com.example.demo.model.Account;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by noba on 12/10/2017.
 */
@FeignClient("account-service")
public interface AccountService {

    @RequestMapping(method = RequestMethod.GET, value = "/accounts/customer/{customerId}")
    List<Account> getAccount(@PathVariable("customerId") Integer customerId);

}
