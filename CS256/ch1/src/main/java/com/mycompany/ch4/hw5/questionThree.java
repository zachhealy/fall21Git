package com.mycompany.ch4.hw5;

/*  
Author: Zach Healy
Date: 10/23/2021
Purpose: 
*/

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;

public class questionThree implements Cloneable {

    private static final int CAPACITY = 8;
    private int[] m_array;
    private int m_top;

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(2);

        Scanner input = new Scanner(System.in);

        System.out.println("Which item do you want removed from the stack?");
        int remv = input.nextInt();

        System.out.println("Original stack: " + stack);
        RemoveItem(stack, remv);
        System.out.println("Removing number " + remv + " from the stack ");
        System.out.println("Modified stack: " + stack);

    }

    public questionThree() {
        m_array = new int[CAPACITY];
        m_top = -1;
    }

    public questionThree(int[] p_array) {
        m_array = new int[CAPACITY];
        m_top = p_array.length - 1;
        try {
            for (int i = 0; i < m_top + 1; i++)
                m_array[i] = p_array[i];
        } catch (ArrayIndexOutOfBoundsException ex) {
            m_top = CAPACITY - 1;
            System.out.println("stack is full");
        }
    }

    public boolean Empty() {
        return m_top == -1;
    }

    public void Push(int e) {
        try {
            m_top++;
            m_array[m_top] = e;
        } catch (ArrayIndexOutOfBoundsException ex) {
            m_top--;
            System.out.println("stack is full " + ex);
        }
    }

    public void Pop() {
        try {
            if (m_top == -1)
                throw new Exception();
            m_top--;
        } catch (Exception ex) {
            System.out.println("stack is empty");
        }
    }

    public int Top() throws Exception {
        if (m_top == -1)
            throw new Exception();
        return m_array[m_top];
    }

    public static void RemoveItem(Stack<Integer> aStack, int item) {
        Stack<Integer> temp = new Stack<>();
        while (!aStack.isEmpty()) {
            if (aStack.peek() != item) {
                temp.push(aStack.peek());
            }
            aStack.pop();
        }
        while (!temp.isEmpty()) {
            aStack.push(temp.pop());
        }
    }

    @Override
    public String toString() {
        String outstr = "";
        if (m_top == -1) {
            System.out.println("stack is empty");
        }
        for (int i = m_top; i > -1; i--)
            outstr += m_array[i] + "\n";

        return outstr;
    }

    @Override
    public Object clone() {
        questionThree st = new questionThree();
        st.m_top = m_top;
        st.m_array = m_array.clone();

        return st;
    }
}
