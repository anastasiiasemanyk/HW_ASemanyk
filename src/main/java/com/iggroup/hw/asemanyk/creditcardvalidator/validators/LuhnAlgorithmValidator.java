package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

public class LuhnAlgorithmValidator implements StringValidator {
    public boolean validate(String inputNumber) {
        int checkSum = 0;
        for (int i = 0; i < inputNumber.length(); i++) {
            int digit = Character.getNumericValue(inputNumber.charAt(inputNumber.length() - i - 1));
            if (i % 2 != 0) {
                digit = digit * 2;
                digit = digit > 9 ? digit - 9 : digit;
            }
            checkSum += digit;
        }
        return checkSum % 10 == 0;
    }
}

