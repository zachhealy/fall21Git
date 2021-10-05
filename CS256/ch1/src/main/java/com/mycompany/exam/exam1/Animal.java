package com.mycompany.exam.exam1;
import java.util.Date;

public class Animal {
    protected boolean vegetarian;
    protected String eatings;
    protected int numOflegs;
    protected Date birthDate;

    public Animal(){
        vegetarian = false;
        eatings = "bacon";
        numOflegs = 4;
        birthDate = new Date();

    }
    public Animal(boolean veg, String eat, int legs, Date date){
        vegetarian = veg;
        eatings = eat;
        numOflegs = legs;
        birthDate = date;

    }
    public void setAnimal(boolean veg, String eat, int legs){
        vegetarian = veg;
        eatings = eat;
        numOflegs = legs;

    }
    public Boolean getVegetarian(){
        return vegetarian;

    }
    public String getEatings() {
        return eatings;
    }
    public int getNumOflegs() {
        return numOflegs;
    }
    @Override
    public String toString() {
        return vegetarian + " " +
        eatings + " " + numOflegs + " " + birthDate;
    }
}
