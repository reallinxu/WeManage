package com.wm.gateway.test;

import org.springframework.stereotype.Component;

@Component
public class HystrixTest implements FeignTest{
    @Override
    public String helloNacos(String str) {
        return "i am hystrix:" + str;
    }
}
