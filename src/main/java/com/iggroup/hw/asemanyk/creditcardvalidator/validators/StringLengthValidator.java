package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StringLengthValidator implements StringValidator {

    private final int length;

    public boolean validate(String inputNumber) {
        return inputNumber.length() == length;
    }
}
