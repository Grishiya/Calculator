package com.example.calculator1.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParametrizedTest {
    CalculatorService underTest = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("dataForDivide")
    void divide__returnDouble(double num1, double num2, double expectedResult) {
        var result = underTest.divide( num1, num2 );
        assertEquals( expectedResult,
                result );
    }

    private static Stream<Arguments> dataForDivide() {
        return Stream.of(
                Arguments.of( 4.2, 2, 2.1 ),
                Arguments.of( 5, 2, 2.5 )
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void multiply__returnDouble(double num1, double num2, double expectedResult) {
        var result = underTest.multiply( num1, num2 );
        assertEquals( expectedResult,
                result );
    }

    private static Stream<Arguments> dataForMultiply() {
        return Stream.of(
                Arguments.of( 4, 2, 8 ),
                Arguments.of( 5.1, 2, 10.2 )
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMinus")
    void minus__returnDouble(double num1, double num2, double expectedResult) {
        var result = underTest.minus( num1, num2 );
        assertEquals( expectedResult,
                result );
    }

    private static Stream<Arguments> dataForMinus() {
        return Stream.of(
                Arguments.of( 4.2, 2, 2.2 ),
                Arguments.of( 5, 2, 3 )
        );
    }
    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus__returnDouble(double num1, double num2, double expectedResult) {
        var result=underTest.plus( num1,num2 );
        assertEquals( expectedResult,
                result );
    }

    private static Stream<Arguments> dataForPlus() {
        return Stream.of(
                Arguments.of( 4.2, 2, 6.2 ),
                Arguments.of( 5,2,7 )
        );
    }



}
