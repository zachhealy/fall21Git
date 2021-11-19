package com.mycompany.ch8.cLab14;

public class ComplexMatrix extends GenericMatrix<Complex> {

    @Override
    public Complex add(Complex m1, Complex m2) {
        return m1.add(m2);
    }

    @Override
    public Complex multiple(Complex m1, Complex m2) {
        return m1.multiply(m2);
    }

    @Override
    public Complex zero() {
        return new Complex(0);
    }

}
