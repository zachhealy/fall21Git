package com.mycompany.exam.exam1;

import java.util.Date;

public class testAnimal{
    public static void main(String[] args) {
        boolean Veg = false;
        String Eat = "Grass";
        int Legs = 4;
        String Color = "black";
        Date d1 = new Date();

        Cat e1 = new Cat();
        Cat e2 = new Cat(Veg, Eat, Legs, Color, d1);

        boolean vege = true;
        String eats = "Bread";
        int legsNum = 3;

        e1.setAnimal(vege, eats, legsNum);
        e1.setColor("White");

        System.out.println();
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
    }

}
