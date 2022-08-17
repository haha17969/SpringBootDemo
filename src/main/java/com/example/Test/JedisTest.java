package com.example.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {

    public void JedisTest(){
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.getClient().getPort());
        System.out.println("连接本地的Redis服务器成功");
        //查看服务是否运行
        System.out.println("服务正在运行：" + jedis.ping());

    }

    public static void main(String[] args) {
        JedisTest jedisTest = new JedisTest();
        jedisTest.JedisTest();
    }

}
