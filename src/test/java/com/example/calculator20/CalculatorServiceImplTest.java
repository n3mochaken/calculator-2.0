package com.example.calculator20;

import com.example.calculator20.service.CalculatorService;
import com.example.calculator20.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    private CalculatorService calculatorService = new CalculatorServiceImpl();
    private Integer expectedResult = 10;

    @Test
    public  void additionTest(){
        assertEquals(expectedResult, calculatorService.addition(7,3));
    }
    @Test
    public void additionTestWithNegative(){
        assertEquals(expectedResult, calculatorService.addition(20,-10));
    }
    @Test
    public void subtractionTest(){
        assertEquals(expectedResult, calculatorService.subtraction(11,1));
    }
    @Test
    public void subtractionTestWithNegative(){
        assertEquals(expectedResult, calculatorService.subtraction(-1,-11));
    }
    @Test
    public void multiplication(){
        assertEquals(expectedResult, calculatorService.multiplication(2,5));
    }
    @Test
    public void multiplicationWithNegative(){
        assertEquals(expectedResult, calculatorService.multiplication(-2,-5));
    }
    @Test
    public void divideTest(){
        assertEquals(expectedResult, calculatorService.division(100,10));
    }
    @Test
    public void divideTestWithNegative(){
        assertEquals(expectedResult, calculatorService.division(-100,-10));
    }

    @Test
    public void divideExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> calculatorService.division(1,0));
    }


}
