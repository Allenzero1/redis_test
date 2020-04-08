package com.qf.redis_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;

import java.util.Collections;

@SpringBootTest
class RedisTestApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        String lua = "local key = KEYS[1] local money = tonumber(redis.call('get', 'key')) if money >= 10000 then return 'yq' else return 'qb' end";

        String result = (String) stringRedisTemplate.execute(  //非序列化模板对象，key没有被序列化可以用这个对象调方法
                new DefaultRedisScript(lua, String.class),
                Collections.singletonList("money"));
        System.out.println(result);

    }
}
