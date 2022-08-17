package com.example.service.serviceimpl;

import com.example.bean.Product;
import com.example.common.ExeceptionEnum;
import com.example.common.MyException;
import com.example.dao.productDao;
import com.example.service.productService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class productServiceImpl implements productService {

    @Autowired
    productDao productdao;
    @Override
    public Product selectProduct(long id) {
        Product product = productdao.selectProduct(id);
        return product;
    }

   @Cacheable(value = "addProduct",key="test")
    public void addProduct(Product product) {
        Product product1 = new Product();
        BeanUtils.copyProperties(product,product1);
        Product product2 = productdao.selectByName(product.getProductName());
        if(product2!=null)
            throw  new MyException(ExeceptionEnum.PRODUCT_NAME_MESSAGE);
           productdao.addProduct(product1);

    }



}
