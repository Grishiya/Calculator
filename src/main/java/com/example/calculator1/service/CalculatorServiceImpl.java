package com.example.calculator1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "<big>Добро пожаловать в калькулятор !</big>";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
      return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {

        return num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0||num1==0) {
            throw new IllegalArgumentException( "Делить на 0, нельзя!");
        }
      return (double) num1/num2;
    }
}
