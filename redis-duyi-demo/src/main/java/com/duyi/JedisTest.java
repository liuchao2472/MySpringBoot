package com.duyi;

import redis.clients.jedis.Jedis;

public class JedisTest {

    public static void main(String[] args) {


        Jedis jedis = new Jedis("192.168.231.130",6379);

        jedis.set("jedis","hello");
        System.out.println(jedis.get("jedis"));


        jedis.close();
    }
}
