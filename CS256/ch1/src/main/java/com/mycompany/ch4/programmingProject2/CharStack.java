package com.mycompany.ch4.programmingProject2;

import java.io.*;
import java.util.*;
import java.io.IOException;

/**
 *
 * ziping
 */
public class CharStack {
    private Stack<Character> myCharacters; // STL stack of chars.

    public void StringToStack(String inStr) {
        myCharacters = new Stack<>();
        for (Character c : inStr.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                myCharacters.push(c);
            }
        }
    }
    /*
     * StringToStack function reads the string into its private stack. Precondition:
     * check if a character is an alphabetic letter Postcondition: only alphabetic
     * letters of the string are in the private stack. Other characters(like space,
     * digit, punct, etc) can not be in the stack.
     * 
     */

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
    /*
     * Reverse function empties its private stack out into another stack, causing
     * the order of the characters to be reversed. Returns this new stack.
     * Precondition: Private stack is not empty. Postcondition: If private stack is
     * empty, displays error and returns. Otherwise: Returns new stack containing
     * private stack's elements in reverse order. Private stack is empty.
     */

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

    /**
     * IsEqual function tests if both private stack and B's stack are the same.
     * 
     * Precondition: Neither stack is empty.
     * 
     * Postcondition: If either stack is empty, displays error message and returns.
     * 
     * Otherwise: Returns true if both stacks are the same, returns false otherwise.
     * Both the private stack and B's stack are empty.
     */

    @Override
    public String toString() {
        return "hello";
    }
    /*
     * Postcondition: Contents of stack have been converted to string on one line.
     * the private stack myCharacters is unchanged.
     */

}
