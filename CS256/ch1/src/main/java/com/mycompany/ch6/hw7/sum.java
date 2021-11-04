package com.mycompany.ch6.hw7;

public class sum {
    public static void main(String[] args) {
        System.out.println(m(1));
    }

    public static double m(double i) {
        if (i > 11) {
            return 0;

        } else {
            return (i / (i + 1) + m(i + 1));

        }

    }

}
