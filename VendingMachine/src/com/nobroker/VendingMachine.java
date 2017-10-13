package com.nobroker;
import com.nobroker.Product;
import com.nobroker.Payment;

import java.util.HashMap;

public class VendingMachine {

    private HashMap<Integer, Product> products = new HashMap<Integer, Product>();
    private int numProduct=0;


    public VendingMachine() {
        this.numProduct++;
        this.products.put(this.numProduct, new Product("Coke", 25, 100));
        this.numProduct++;
        this.products.put(this.numProduct, new Product("Pepsi", 35, 100));
        this.numProduct++;
        this.products.put(this.numProduct, new Product("Soda", 45, 100));
    }

    public HashMap<Integer, Product> getProducts() {
        return this.products;
    }

    public void addProduct(Product p){
        this.numProduct++;
        this.products.put(this.numProduct, p);
    }

    public int getProduct(int key, Payment moneyPaid){
        Product product = (Product)products.get(key);
        if(product.getPrice() > moneyPaid.getTotal()){
            throw new ArithmeticException("Amount paid is less than the price");
        }else{

            int remChange = moneyPaid.getTotal() - product.getPrice();
            product.selectProduct();
            products.put(key, product);
            return remChange;

        }
    }

}
