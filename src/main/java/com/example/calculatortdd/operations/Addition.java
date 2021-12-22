package com.example.calculatortdd.operations;

import lombok.Builder;

import java.util.stream.Stream;

@Builder
public class Addition implements Operation{

    @Override
    public Object calculate(Object ... numbers) {
        return Stream.of(numbers).mapToDouble(number -> (Double) number).sum();
    }

}
