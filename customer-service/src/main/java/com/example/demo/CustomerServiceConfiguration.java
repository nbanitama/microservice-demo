package com.example.demo;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by noba on 12/10/2017.
 */
@Configuration
@ComponentScan("com.example.demo")
public class CustomerServiceConfiguration {

    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

}
