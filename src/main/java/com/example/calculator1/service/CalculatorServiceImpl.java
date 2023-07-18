package com.example.calculator1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int calculator;
    @Override
    public int getCalculator(){
        return ++calculator;
    }
}
