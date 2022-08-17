package com.example.service;

import com.example.bean.Product;

public interface productService {

    Product selectProduct(long id);

    void addProduct(Product product);
}
