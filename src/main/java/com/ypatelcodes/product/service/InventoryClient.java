package com.ypatelcodes.product.service;

import com.ypatelcodes.product.dto.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="inventory-service")
public interface InventoryClient {
    @PostMapping("/inventory")
    Inventory addProductToInventory(@RequestBody Inventory inventory);
}