package com.example.dao;

import com.example.bean.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface productDao {
    Product selectProduct(long id);
    void addProduct(Product product);
    Product selectByName(String productName);

}
