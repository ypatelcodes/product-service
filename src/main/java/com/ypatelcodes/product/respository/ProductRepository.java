package com.ypatelcodes.product.respository;

import com.ypatelcodes.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
