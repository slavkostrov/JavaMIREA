package com.practice_10.complex;

import com.practice_10.complex.Complex;

public interface ComplexAbstractFactory {
    Complex CreateComplex(double real, double image);
    Complex createComplex();
}
