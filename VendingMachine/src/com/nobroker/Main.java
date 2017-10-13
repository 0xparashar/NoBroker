package com.nobroker;

import java.util.Map;
import java.util.Scanner;

public class Main {



    public static void main(String args[]){

        VendingMachine machine = new VendingMachine();

        while(true) {

            System.out.println("Press 1 if you are a customer, or 2 if you are a supplier");
            Scanner reader = new Scanner(System.in);

            int input = reader.nextInt();

            if (input == 1) {

                for (Map.Entry<Integer, Product> entry : machine.getProducts().entrySet()) {
                    System.out.println("Press " + entry.getKey() + " for " + entry.getValue().getName() + ", price: " + entry.getValue().getPrice());
                }

                int productKey = reader.nextInt();

                System.out.println("Enter the number of 1 cents:");
                int one = reader.nextInt();
                System.out.println("Enter the number of 5 cents:");
                int five = reader.nextInt();
                System.out.println("Enter the number of 10 cents:");
                int ten = reader.nextInt();
                System.out.println("Enter the number of 25 cents:");
                int twentyFive = reader.nextInt();

                Payment payment = new Payment(one, five, ten, twentyFive);

                int change = machine.getProduct(productKey, payment);

                if (change != 0) {
                    System.out.println("Please collect your change: " + change + ".");
                }

                System.out.println("Thank you for shopping with us");


            } else if (input == 2) {
                System.out.println("Enter the name of product to be added: ");
                String name = reader.nextLine();
                System.out.println("Enter its price: ");
                int price = reader.nextInt();
                System.out.println("Enter the quantity to be added: ");
                int quantity = reader.nextInt();

                machine.addProduct(new Product(name, price, quantity));

            }

        }

    }
}
