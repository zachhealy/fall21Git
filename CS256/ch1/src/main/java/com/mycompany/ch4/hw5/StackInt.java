package com.mycompany.ch4.hw5;

/*  
Author: Zach Healy
Date: 10/23/2021
Purpose: 
*/

public class StackInt implements Cloneable {

    private static final int CAPACITY = 8;
    private int[] m_array;
    private int m_top;

    public StackInt() {
        m_array = new int[CAPACITY];
        m_top = -1;
    }

    public StackInt(int[] p_array) {
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

    public static void Remove(int n) {
        for (int i = 0; i < n; i++) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Removed all elements");
            }

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
        StackInt st = new StackInt();
        st.m_top = m_top;
        st.m_array = m_array.clone();

        return st;
    }
}
