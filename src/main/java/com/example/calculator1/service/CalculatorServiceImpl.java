package com.example.calculator1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "<big>Добро пожаловать в калькулятор !</big>";
    }

    @Override
    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double minus(double num1, double num2) {
      return num1-num2;
    }

    @Override
    public double multiply(double num1, double num2) {

        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0||num1==0) {
            throw new IllegalArgumentException( "Делить на 0, нельзя!");
        }
      return num1/num2;
    }
}
