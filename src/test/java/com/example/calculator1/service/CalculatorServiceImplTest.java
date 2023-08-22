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
        var result = underTest.plus( 5, 5 );
        assertEquals( 10, result );
    }

    @Test
    void plus_num1PlusNum2_negativeNumbers() {
        var result = underTest.plus( -5, -5 );
        assertEquals( -10, result );
    }

    @Test
    void minus_num1PlusNum2_negativeNumbers() {
        var result = underTest.minus( -5, -5 );
        assertEquals( 0, result );
    }

    @Test
    void minus_num1PlusNum2_positiveNumbers() {
        var result = underTest.minus( 12, 6 );
        assertEquals( 6, result );
    }

    @ParameterizedTest
    @MethodSource
    void divide__returnDouble(int num1, int num2, double result) {
dataForDivide();
    }

    private  Stream<Arguments> dataForDivide() {
        return Stream.of(
                Arguments.of( 4, 2, 2 ),
                Arguments.of( 5,2,2.5 )
        );
    }


}
