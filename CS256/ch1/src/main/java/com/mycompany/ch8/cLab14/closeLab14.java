package com.mycompany.ch8.cLab14;

class closeLab14 {
    public static void main(String[] args) {
        Complex[][] m1 = createMatrix(3);
        Complex[][] m2 = createMatrix(3);


        //ComplexMatrix matrix = new ComplexMatrix();
        //ComplexMatrix.printResult(m1, m2, matrix.addMatrix(m1, m2), '+');

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
/*
class ComplexMatrix extends GenericStack<Complex> {
    @Override
    protected Complex add(Complex o1, Complex o2) {
        return o1.add(o2);
    }

    @Override
    protected Complex multiply(Complex o1, Complex o2) {
        return o1.multiply(o2);
    }

    @Override
    protected Complex zero() {
        return new Complex(0);
    }
}
*/