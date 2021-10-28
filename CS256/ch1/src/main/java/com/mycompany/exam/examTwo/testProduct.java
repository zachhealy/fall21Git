package com.mycompany.exam.examTwo;

import java.util.*;

public class testProduct {
    public static void main(String[] args) {
        int id = 1350;
        String name = "John";
        double wholesalePrice = 2.50;
        String retail = "JCPenny";

        JProduct productOne = new JProduct();
        JProduct productTwo = new JProduct(id, name, wholesalePrice, retail);

        int temp = productOne.compareTo(productTwo);

        if(temp == 1){
            System.out.println("ID: " + productOne.getID());
            System.out.println("Name: " + productOne.getName());
            System.out.println("Price: " + productOne.getwholesaleprice());
            System.out.print("Retailers: ");
            for(int i = 0; i < productOne.getRetailers().size(); i++){
                System.out.println(productOne.getRetailers() + ", ");

            }

        }else if(temp == -1){
            System.out.println("ID: " + productTwo.getID());
            System.out.println("Name: " + productTwo.getName());
            System.out.println("Price: " + productTwo.getwholesaleprice());
            System.out.print("Retailers: ");
            for(int i = 0; i < productTwo.getRetailers().size(); i++){
                System.out.println(productTwo.getRetailers());

            }

        }else{
            System.out.println("They are the same");

        }
        JProduct productThree;
        if(temp == 1){
            productThree = (JProduct)productOne.clone();

        }else{
            productThree = (JProduct)productTwo.clone();

        }

        System.out.println();

        ArrayList<String> retails = new ArrayList<String>();
        retails.add("Walmart");
        retails.add("Target");

        productThree.setPrice(4.5);
        productThree.setRetailers(retails);
        System.out.println("ID: " + productThree.getID());
        System.out.println("Name: " + productThree.getName());
        System.out.println("Price: " + productThree.getwholesaleprice());
        System.out.print("Retailers: ");
        System.out.println(productThree.getRetailers());

    }   
}
