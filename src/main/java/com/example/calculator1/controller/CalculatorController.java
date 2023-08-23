package com.example.calculator1.controller;

import com.example.calculator1.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2) +", теперь попробуй minus ";
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
         return calculatorService.minus(num1, num2)+", теперь попробуй multiply ";
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2)+", теперь попробуй divide ";
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int num1, @RequestParam int num2) {

        return calculatorService.divide(num1, num2);

    }
}
