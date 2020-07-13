package com.wm.rest.controller;

import com.wm.rest.util.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @RequestMapping(value={"/redis"})
    @ResponseBody
    public String redis() {
        RedisUtil.redisPut("test1", "heihei");
        return RedisUtil.redisGet("test1");
    }
}
