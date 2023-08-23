package com.example.calculator1.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    CalculatorService underTest = new CalculatorServiceImpl();

    @Test
    void welcome__returnWelcomeString() {
        String result = underTest.welcome();
        assertEquals( "<big>Добро пожаловать в калькулятор !</big>", result );
    }

    @Test
    void divide_num1DivideNum2WithoutFraction_resultWithoutFraction() {
        var result = underTest.divide( 4, 2 );
        assertEquals( 2, result );
    }

    @Test
    void divide_num1DivideNum2WithFraction_resultWithFraction() {
        var result = underTest.divide( 5, 2 );
        assertEquals( 2.5, result );
    }

    @Test
    void divide_ifNum1orNum2Is0_throwRuntimeException() {
        assertThrows( IllegalArgumentException.class, () -> underTest.divide( 0, 2 ) );

    }

    @Test
    void plus_num1PlusNum2_positiveNumbers() {
        var result = underTest.plus( 5.5,5.5 );
        assertEquals( 11, result );
    }

    @Test
    void plus_num1PlusNum2_maxNumbers() {
        var result = underTest.plus( Integer.MAX_VALUE,Integer.MAX_VALUE );
        assertEquals( 4.294967294E9, result );
    }

    @Test
    void minus_num1MinusNum2_minNumbers() {
        var result = underTest.minus(Integer.MIN_VALUE, Integer.MAX_VALUE );
        assertEquals( -4.294967295E9, result );
    }

    @Test
    void minus_num1MinusNum2_negativeNumbers() {
        var result = underTest.minus( -12, 6 );
        assertEquals( -18, result );
    }

    @Test
    void multiply_num1MultiplyNum2_maxMultiply(){
        var result=underTest.multiply( Integer.MAX_VALUE,Integer.MAX_VALUE );
        assertEquals( 4.6116860141324206E18,result );
    }
    @Test
    void multiply_num1MultiplyNum2_minMultiply(){
        var result=underTest.multiply( Integer.MAX_VALUE,Integer.MIN_VALUE );
        assertEquals( -4.6116860162799043E18,result );
    }
    @Test
    void multiply_num1MultiplyNum2_fraction(){
        var result=underTest.multiply( 3,3.1 );
        assertEquals( 9.3,result );
    }




}
