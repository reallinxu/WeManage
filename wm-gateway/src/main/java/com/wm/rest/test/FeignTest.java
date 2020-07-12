package com.wm.rest.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "wm-core",fallback = HystrixTest.class)
public interface FeignTest {

    @GetMapping("/echo/{str}")
    String helloNacos(@PathVariable String str);

}
