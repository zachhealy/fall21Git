
package com.mycompany.ch8.lab14Noah;

public class Lab14 {

    public static void main(String[] args) {
        Complex[][] m1 = { { new Complex(3.5, 5.5), new Complex(-3.5, 1) },
                { new Complex(3.5, 5.5), new Complex(-3.5, 1) } };
        Complex[][] m2 = { { new Complex(3.5, 5.5), new Complex(-3.5, 1) },
                { new Complex(3.5, 5.5), new Complex(-3.5, 1) } };

        ComplexMatrix matrix = new ComplexMatrix();
        ComplexMatrix.printResult(m1, m2, matrix.addMatrix(m1, m2), '+');

    }

    public static Complex[][] createMatrix(int size) {
        Complex[][] m1 = new Complex[size][size];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {

                m1[i][j] = new Complex(Math.random() * 10, Math.random() * 10);
            }
        }

        return m1;
    }

}
