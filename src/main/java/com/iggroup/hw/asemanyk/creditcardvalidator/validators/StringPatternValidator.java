package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StringPatternValidator implements StringValidator {

    private final String pattern;

    public boolean validate(String inputNumber) {
        return inputNumber.matches(pattern);
    }
}
