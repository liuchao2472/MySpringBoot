package com.duyi;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolTest {

    public static void main(String[] args) {

        JedisPoolConfig config = new JedisPoolConfig();

        config.setMaxTotal(10);
        JedisPool pool = new JedisPool(config,"192.168.231.130",6379);
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            jedis.set("pool","hello666666666");
            System.out.println(jedis.get("pool"));

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (jedis != null){
                jedis.close();
            }
        }
        pool.close();

    }

}
