package com.example.calculator20;

import com.example.calculator20.service.CalculatorService;
import com.example.calculator20.service.CalculatorServiceImpl;
import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParametrizedTest {
    private CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> paramsForTests() {
        return Stream.of(
                Arguments.of (10, 20)
        );

    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void test1(int num1, int num2) {
        int result1 = 30;
        assertEquals(result1,calculatorService.addition(num1,num2));
    }
    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void test2(int num1, int num2) {
        int result1 = -10;
        assertEquals(result1,calculatorService.subtraction(num1,num2));
    }
    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void test3(int num1, int num2) {
        int result1 = 200;
        assertEquals(result1,calculatorService.multiplication(num1,num2));
    }
    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void test4(int num1, int num2) {
        double result1 = 0;
        assertEquals(result1,calculatorService.division(num1,num2));
    }
}