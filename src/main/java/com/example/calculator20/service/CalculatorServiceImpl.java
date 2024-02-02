package com.example.calculator20.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public  int addition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    @Override
    public int multiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }


    @Override
    public String welcome() {
        return "Welcome to Calculator";
    }

    @Override
    public int subtraction(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    @Override
    public int division(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}