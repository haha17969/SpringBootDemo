package com.example.controller;

import com.example.Test.RedisCacheUtil;
import com.example.bean.Product;
import com.example.common.ApiRestResponse;
import com.example.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class productController {
     @Autowired
     productService productservice;

     @Resource
    RedisCacheUtil redisCacheUtil;

/*
     @GetMapping("/product")
    public ApiRestResponse productDetail(@RequestParam("id") int id){
         Product product = (Product)redisCacheUtil.get(id);
         if(product==null)
         {
              product = productservice.selectProduct(id);
             redisCacheUtil.set(product);
             System.out.print("从数据库中取");
         }
         else{
             System.out.print("从redis中取");
         }

        return ApiRestResponse.success(product);
    }
*/

    @GetMapping("/product")
    public ApiRestResponse productDetail(@RequestParam("id") int id){
        Product product = (Product)redisCacheUtil.get(id);
        if(product==null)
        {
            product = productservice.selectProduct(id);
           // redisCacheUtil.set(product);
            System.out.print("从数据库中取");
        }
        else{
            System.out.print("从redis中取");
        }

        return ApiRestResponse.success(product);
    }

}
