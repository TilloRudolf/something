package com.example.java;

public class Calc {
    private double a,b;
    private double res;

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double summ(double a , double b){
        this.a = a;
        this.b = b;
        res = a + b;
        return res;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "res=" + res +
                '}';
    }
}
