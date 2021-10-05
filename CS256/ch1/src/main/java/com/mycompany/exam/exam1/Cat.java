package com.mycompany.exam.exam1;

import java.util.Date;

public class Cat extends Animal{
    private String color;

    public Cat(){
        super();
        color = "white";

    }
    public Cat(Boolean veg, String eat, int legs, String color1, Date date){
        vegetarian = veg;
        eatings = eat;
        numOflegs = legs;
        color = color1;
        birthDate = date;

    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return vegetarian + " " + color + " " +
        eatings + " " + numOflegs + " " + birthDate;
    }
}
