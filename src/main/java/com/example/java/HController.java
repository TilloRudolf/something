package com.example.java;

import com.example.java.engine.CalcController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody
    Response getCharNum(@RequestParam String text) {

        Response result = new Response();

        if (text != null) {
            result.setText(text);
        }

        return result;
    }

    @RequestMapping("/calc")
    public String calc1(){
        return "calc";
    }

//TODO
    @RequestMapping(value = "/summ", method = RequestMethod.GET)
    public @ResponseBody
    Summ doCalc(@RequestParam(value = "text1",required = false, defaultValue = "0.0") String text,
                @RequestParam(value = "text2", required = false, defaultValue = "0.0") String text2){
        Summ summ = new Summ();
        Calc calc = new Calc();
        Number number = new Double(text);
        Number number1 = new Double(text2);
        double a = number.doubleValue();
        double b = number1.doubleValue();
        double c = calc.summ(a, b);
        summ.summ(c);
        return summ;
    }

    @RequestMapping(value = "/operation", method = RequestMethod.GET)
    public @ResponseBody
    CalcController doOpr(@RequestParam(value = "text1", required = false, defaultValue = "0.0") String num1,
                         @RequestParam(value = "text2", required = false, defaultValue = "0.0") String num2,
                         @RequestParam(value = "text3", required = false, defaultValue = "0") String oper){
        Number number = new Double(num1);
        Number number1 = new Double(num2);
        Number number2 = new Integer(oper);
        double a = number.doubleValue();
        double b = number1.doubleValue();
        int c = number2.intValue();
        CalcController calCtr = new CalcController();
        calCtr.result(a, b, c);
        System.out.println(calCtr.result(a,b,c));
//        String res = calCtr.getResult();
        return calCtr;
    }

    @RequestMapping("/hei")
    public String hei(){
        return "word";
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public @ResponseBody
    WordController doWord(@RequestParam(value = "text1", required = false, defaultValue = "null") String text,
                          @RequestParam(value = "text2", required = false, defaultValue = "null") String req){
        WordController word = new WordController();
        word.goWord(text, req);
        return word;
    }
}
