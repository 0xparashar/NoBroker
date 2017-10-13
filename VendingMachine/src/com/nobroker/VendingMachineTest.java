package com.nobroker;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class VendingMachineTest {

    VendingMachine testMachine = new VendingMachine();

    @Test
    public void getProducts() throws Exception {

        HashMap<Integer, Product> products = testMachine.getProducts();

        assertEquals(3, products.size());

    }

    @Test
    public void addProduct() throws Exception {
        testMachine.addProduct(new Product("Fenta", 55, 100));

        assertEquals(4, testMachine.getProducts().size());
    }

    @Test
    public void getProduct() throws Exception {
        int change = testMachine.getProduct(2, new Payment(10, 4,1,0));

        assertEquals(5, change);

    }



}