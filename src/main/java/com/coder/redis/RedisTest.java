package com.coder.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2015/4/29.
 */
public class RedisTest {

    public static void main(String[] args){
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.print(value);
    }
}
