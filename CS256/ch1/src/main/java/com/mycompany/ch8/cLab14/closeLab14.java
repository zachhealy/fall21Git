package com.mycompany.ch8.cLab14;

class closeLab14 {
    public static void main(String[] args) {
        Complex[][] m1 = { { new Complex(1, 2), new Complex(2, 1) }, { new Complex(1, 2), new Complex(2, 1) } };
        Complex[][] m2 = { { new Complex(1, 2), new Complex(2, 1) }, { new Complex(1, 2), new Complex(2, 1) } };

        ComplexMatrix matrix = new ComplexMatrix();
        ComplexMatrix.printResult(m1, m2, matrix.addMatrix(m1, m2), '+');

    }

}