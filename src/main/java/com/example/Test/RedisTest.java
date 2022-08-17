package com.example.Test;
import com.example.bean.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class RedisTest {

    private RedisCacheUtil redisCacheUtil;



   /* @Autowired

    private RedisTemplate<String,Object> redisTemplate;
    *//*@Autowired
    private StringRedisTemplate stringRedisTemplate;*//*



    public void put() {



        // 可以返回map映射，并且RedisConfig需要配置template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        Object userByKey = redisTemplate.opsForValue().get("product");
        System.out.print(userByKey);
        // 只有hash类型可以强转为对象，并且RedisConfig需要配置template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

    }

    public static void main(String[] args) {
        RedisTest redisTest = new RedisTest();
        redisTest.put();
    }
*/
    }
