package com.example.java;

public class WordCheck {
    private String text;
    private boolean wrongChar = false;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isWrongChar() {
        return wrongChar;
    }

    public void setWrongChar(boolean wrongChar) {
        this.wrongChar = wrongChar;
    }

    public void doCheck(String text){
        char[] numb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] r = text.toCharArray();
        for (char q: r){
            for (char c: numb){
                if (c == q)
                    this.wrongChar = true;
            }

        }
    }

    public void getWrongChar(){
        if(wrongChar)
            text = "Недопустим ввод цифр!";
    }
}
