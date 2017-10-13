package com.nobroker;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class Product {

    private int price;
    private int quantity;
    private String name;


    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void selectProduct(){
        if(this.quantity==0){
            throw new ArithmeticException("No "+this.name+" available at the moment");
        }
        this.quantity--;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void addQuantity(int incr){
        this.quantity+=incr;
    }

    public int getPrice() {
        return this.price;
    }


}
