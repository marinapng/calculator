package com.example.calculatortdd.operations;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionTest {

    private static final Addition addition  = Addition.builder().build();

    @Test
     public void shouldSumDefinedParameters() {
        Object firstNumber = 0.0;
        Object secondNumber = 1.0;
        addition.calculate(firstNumber, secondNumber);
        assertThat(addition.calculate(firstNumber, secondNumber)).isEqualTo(1.0);
    }

    @Test
    public void shouldSumAnyParameters() {
        double firstNumber = Mockito.anyDouble();
        double secondNumber = Mockito.anyDouble();
        addition.calculate(firstNumber, secondNumber);
        assertThat(addition.calculate(firstNumber, secondNumber)).isEqualTo(firstNumber + secondNumber);
    }

}