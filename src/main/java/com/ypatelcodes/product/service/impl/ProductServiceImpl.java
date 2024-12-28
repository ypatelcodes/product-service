package com.ypatelcodes.product.service.impl;

import com.ypatelcodes.product.dto.Inventory;
import com.ypatelcodes.product.model.Product;
import com.ypatelcodes.product.respository.ProductRepository;
import com.ypatelcodes.product.service.InventoryClient;
import com.ypatelcodes.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    InventoryClient inventoryClient;
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        Inventory inventory = new Inventory();
        inventory.setProductId(product.getId());
         Inventory inventoryResponse = inventoryClient.addProductToInventory(inventory);
         return inventoryResponse.getQuantity()>0 ? null : productRepository.save(product);
    }
}
