package com.wm.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;


@FeignClient(name = "wm-core",fallback = HystrixTest.class)
public interface FeignTest {

    @GetMapping("/echo/{str}")
    String helloNacos(@PathVariable String str);

}
