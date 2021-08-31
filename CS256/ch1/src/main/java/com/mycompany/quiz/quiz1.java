package com.mycompany.quiz;
/*  
Author: Zach Healy
Date: 8/29/2021
Purpose: This code will define a playing card, allow the user to access the card info, 
as well as compare cards to see which is greater.
*/
public class quiz1 {
    public static void main(String[] args) {
        Card card1 = new Card("Spade", 10);
        Card card2 = new Card("Diamond", 3);
        
        card1.getSuit();
        card1.getFace();
        System.out.println(card1.getSuit());
        System.out.println(card1.getFace());
        card1.setCard("Heart", 5);
        System.out.println(card1.getSuit());
        System.out.println(card1.getFace());

        System.out.println(card1.isLessThan(card2.getFace()));
    }
}

class Card{
    private String suit;
    private int face;

    public Card(String newSuit, int newFace){
        suit = newSuit;
        face = newFace;

    }
    public String getSuit(){
        return suit;

    }
    public int getFace(){
        return face;

    }
    public void setCard(String newSuit, int newFace){
        suit = newSuit;
        face = newFace;
    }
    public boolean isLessThan(int C){
        if(face > C){
            return true;
        }
        else{
            return false;
        }

    }

}
