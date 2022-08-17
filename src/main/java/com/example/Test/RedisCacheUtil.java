package com.example.Test;

import com.example.bean.Product;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component //注入spring容器
public class RedisCacheUtil {
    @Resource
    private  RedisTemplate<Integer, Object> redisTemplate;
    /**
     * 普通缓存获取
     * @param
     * @return
     */
    public  Object  get(int id) {
        return  redisTemplate.opsForValue().get(id);
    }
    public  void set(Product product) {
        //redisTemplate.opsForValue().set(product.getId(),product,1);
        redisTemplate.opsForValue().getAndSet(product.getId(),"1231");
    }


}
