package org.Jedis;

import redis.clients.jedis.Jedis;


public class JedisMethod {
    private static final String SERVER_ADDRESS = "127.0.0.1"; // 服务器地址
    private static final Integer SERVER_PORT = 6379; // 端口

    private Jedis jedis;

    public void init(){
        System.out.println("====init====");
        jedis = new Jedis(SERVER_ADDRESS,SERVER_PORT);
    }

    public void dis(){
        System.out.println("====dis====");
        jedis.disconnect();
    }

    public void testPub(){
        jedis.publish("__keyevent@0__:expired","heart:test");
//        jedis.set("heart:test","aaa");
//        jedis.expire("heart:test",1);
    }

}
