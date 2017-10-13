package com.nobroker;

import java.util.HashMap;

public class Payment {

    private HashMap<Integer, Integer> paidCoins = new HashMap<Integer, Integer>();

    public Payment(int one, int five, int ten, int twentyFive) {

        this.paidCoins.put(1,one);
        this.paidCoins.put(5,five);
        this.paidCoins.put(10,ten);
        this.paidCoins.put(25,twentyFive);

    }

    public int getTotal(){
       int sum = this.paidCoins.get(1)*1 + this.paidCoins.get(5)*5 + this.paidCoins.get(10)*10 + this.paidCoins.get(25)*25;
       return sum;
    }

}
