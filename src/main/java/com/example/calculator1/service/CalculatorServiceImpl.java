package com.example.calculator1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome(){
        return "Хочешь увидеть магию? Тогда добавь в адресную строку /calculator";
    }
    @Override
    public String plus(int num1, int num2) {
        return null;
    }

    @Override
    public String minus(int num1, int num2) {
        return null;
    }

    @Override
    public String multiply(int num1, int num2) {
        return null;
    }

    @Override
    public String divide(int num1, int num2) {
        return null;
    }
}
