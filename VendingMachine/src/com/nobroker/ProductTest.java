package com.nobroker;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    Product product = new Product("Coke", 25, 100);
    @Test
    public void selectProduct() throws Exception {
        product.selectProduct();
        assertEquals(99, product.getQuantity());

    }

    @Test
    public void addQuantity() throws Exception {
        product.addQuantity(50);
        assertEquals(150, product.getQuantity());

    }

}