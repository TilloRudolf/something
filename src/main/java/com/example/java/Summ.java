package com.example.java;

public class Summ {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String summ(double q){
        double w = q;
        text = String.format("%2f.",w);
        return text;
    }
}
