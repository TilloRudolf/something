package com.example.java.engine;

public class CalcController {
    private String result;
    public String result(double a, double b, int c){
        OperationsArray opArr = new OperationsArray();
        double res = opArr.getOper(a, b, c);
        result = String.format("%.2f", res);
        return result;
    }

    public String getResult() {
        return result;
    }

//    @Override
//    public String toString() {
//        return result;
//    }
}
