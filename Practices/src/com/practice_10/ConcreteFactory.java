package com.practice_10;

public class ConcreteFactory implements ComplexAbstractFactory{

    @Override
    public Complex CreateComplex(double real, double image) {
        return new Complex(real, image);
    }

    @Override
    public Complex createComplex() {
        return new Complex();
    }
}
