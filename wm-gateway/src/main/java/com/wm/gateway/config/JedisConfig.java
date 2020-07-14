package com.wm.gateway.config;

import com.wm.gateway.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableConfigurationProperties(JedisProperties.class)
public class JedisConfig {

    @Autowired
    private JedisProperties prop;

    @Bean
    public JedisPool jedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(prop.getMaxTotal());
        config.setMaxIdle(prop.getMaxIdle());
        config.setMaxWaitMillis(prop.getMaxWaitMillis());
        JedisPool jedisPool;
        if("".equals(prop.getPassword())){
            jedisPool = new JedisPool(config, prop.getHost(), prop.getPort(), prop.getTimeOut());
        }else{
            jedisPool = new JedisPool(config, prop.getHost(), prop.getPort(), prop.getTimeOut(), prop.getPassword());
        }
        // 此处为RedisUtil设置了jedisPool
        RedisUtil.setJedisPool(jedisPool);
        return jedisPool;
    }

}
