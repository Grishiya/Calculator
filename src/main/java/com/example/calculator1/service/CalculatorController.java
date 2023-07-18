package com.example.calculator1.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String text() {
        return "bla vla bla";
    }

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/greetings")
    public String show(@RequestParam String name, @RequestParam String lastName) {
        return lastName + " " + name;
    }
}
