package com.mycompany.ch4.programmingProject3;

import java.util.*;
/**
 *  Authors: Zach Healy, Noah Little, Trinity Smallwood, Jace Lowe, and Cole Huntley
 *  Date: October 29, 2021
 */
public class CharStack {
    private Stack<Character> myCharacters; // STL stack of chars.

    public void StringToStack(String str) {
        myCharacters = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                myCharacters.push(c);
                
            }
        }
    }


    public CharStack Reverse() {
        if (myCharacters.empty()) {
            System.out.println("Stack is empty.");
            return null;

        }
        CharStack s = new CharStack();
        while (!myCharacters.empty()) {
            s.myCharacters.push(myCharacters.pop());

        }
        return s;
    }

    @Override
    public boolean equals(Object B) {
        String s1 = B.toString();
        String s2 = myCharacters.toString();

        if (s1 == s2 && s1.length() != 0) {
            return true;

        } else {
            return false;

        }
    }

    @Override
    public String toString() {
        String s1 = "";
        for(int i=0; i<myCharacters.size(); i++){
            s1 += myCharacters.get(i);

        }
        return s1;
    }


}
