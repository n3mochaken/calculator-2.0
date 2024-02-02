package com.example.calculator20.controller;

import com.example.calculator20.service.CalculatorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showHello() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не введен";
        } else {
            return num1 + " + " + num2 + " = " + calculatorService.addition(num1, num2);
        }

    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не введен";
        } else {
            return num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
        }

    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не введен";
        } else {
            return num1 + " * " + num2 + " = " + calculatorService.multiplication(num1, num2);
        }

    }

    @GetMapping("/divide")
    public String division(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не введен";
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль");
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.division(num1, num2);
        }

    }
}