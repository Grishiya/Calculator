package com.example.calculator1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome(){
        return "<big>Добро пожаловать в калькулятор !</big>";
    }
    @Override
    public String plus(int num1, int num2) {
        int num3=num1+num2;
        return num1+ "+"+num2+"="+num3;
    }

    @Override
    public String minus(int num1, int num2) {
        int num3=num1-num2;
        return num1+ "-"+num2+"="+num3;
    }

    @Override
    public String multiply(int num1, int num2) {
        int num3=num1*num2;
        return num1+ "*"+num2+"="+num3;
    }

    @Override
    public String divide(int num1, int num2) {
        int num3=num1/num2;
        return num1+ "/"+num2+"="+num3;
    }
}
