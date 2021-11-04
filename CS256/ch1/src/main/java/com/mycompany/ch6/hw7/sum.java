package com.mycompany.ch6.hw7;

public class sum {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(m(i));

        }
    }

    public static double m(double i) {
        if (i < 0) {
            return 0;

        } else {
            return (i / (i + 1)) + m(i - 1);

        }

    }

}
