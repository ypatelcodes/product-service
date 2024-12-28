package com.ypatelcodes.product.service;

import com.ypatelcodes.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getAllProduct();
    public Product getProductById(String id);
    public Product addProduct(Product product);
}
