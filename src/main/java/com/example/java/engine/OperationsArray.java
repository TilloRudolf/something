package com.example.java.engine;

import com.example.java.engine.operations.Dev;
import com.example.java.engine.operations.Min;
import com.example.java.engine.operations.Mult;
import com.example.java.engine.operations.Summ;

import java.util.ArrayList;
import java.util.List;

public class OperationsArray {
    private List<Operation> list;
    private Summ summ;
    private Min min;
    private Dev dev;
    private Mult mult;

    OperationsArray(){
        summ = new Summ();
        min = new Min();
        dev = new Dev();
        mult = new Mult();
        list = new ArrayList<>(4);
        list.add(summ);
        list.add(min);
        list.add(dev);
        list.add(mult);
    }
    public double getOper(double a, double b, int c){
        Operation op = list.get(c);
        return op.doOper(a, b);
    }
}
