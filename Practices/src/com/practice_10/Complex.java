package com.practice_10;

public class Complex {
    private double real;
    private double im;
    Complex(double real, double im){
        this.real = real;
        this.im = im;
    }

    Complex(){
        this.real = this.im = 0;
    }


    public Complex add(Complex b){
        return new Complex(this.real + b.real, this.im + b.im);
    }

    public Complex add_(Complex b) // inplace
    {
        this.real += b.real;
        this.im += b.im;
        return this;
    }

    public Complex mul(Complex b){
        return new Complex(this.real * b.real - (this.im * b.im), this.im*b.real + b.im * this.real);
    }

    public Complex mul_(Complex b) // inplace
    {
        this.real = this.real * b.real - (this.im * b.im);
        this.im = this.im*b.real + b.im * this.real;
        return this;
    }

    @Override
    public String toString(){
        return this.real + " + " + this.im + "*i";
    }
}
