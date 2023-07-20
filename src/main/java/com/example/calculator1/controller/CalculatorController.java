package com.example.calculator1.controller;

import com.example.calculator1.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

@GetMapping
public String dobro(){return "Хочешь увидеть магию? Тогда добавь в адресную строку /calculator";
}
    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

}
