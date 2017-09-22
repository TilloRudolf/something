package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class WordController {
    private List<String> list;
    private String result = "совпадений не найдено!!!";
    private String res = "Найдены совпадения: ";
    private String a = "";

    public String getResult() {
        return result;
    }

    public void goWord(String text, String req){
        char[] t = text.toCharArray();
        list = new ArrayList<>();
        for (char e:t) {

            if (e != ','){
                a = a + e;
            }else{
                list.add(a);
                a = "";
            }

        }
        list.add(a);
        for(String w: list){
            if (w.equalsIgnoreCase(req)){
                res = res + String.format("%s , %d по счёту ", w , list.indexOf(w) + 1);
                result = res;
            }
        }
    }
}
