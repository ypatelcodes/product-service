package com.ypatelcodes.product.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {
    @Id
    private String productId;
    private int quantity;

/*    public Inventory(InventoryBuilder inventoryBuilder) {
        this.productId = inventoryBuilder.productId;
        this.quantity = inventoryBuilder.quantity;
    }*/

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }

/*    public static class InventoryBuilder{
        private String productId;
        private int quantity;

        public InventoryBuilder() {
        }

        public InventoryBuilder productId(String productId){
            this.productId = productId;
            return this;
        }
        public InventoryBuilder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }

        public Inventory build(){
            return new Inventory(this);
        }

    }*/

}

