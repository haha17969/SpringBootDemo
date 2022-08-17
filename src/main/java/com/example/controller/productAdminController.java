package com.example.controller;

import com.example.bean.Product;
import com.example.common.ApiRestResponse;
import com.example.service.productService;
import io.lettuce.core.dynamic.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("hehe")
public class productAdminController {
    @Autowired
    productService productService;

    @PostMapping("/product/admin/add")
 public ApiRestResponse addProduct(@RequestBody Product product){
     productService.addProduct(product);
     return ApiRestResponse.success(product);
 }
}
