package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringPatternValidatorTests {
    StringPatternValidator validator = new StringPatternValidator("^\\d+$");

    @Test
    public void testDigitsOnly() {
        boolean result = validator.validate("123");
        assertTrue(result);
    }

    @Test
    public void testNotDigitsOnly() {
        boolean result = validator.validate("12 ");
        assertFalse(result);
    }
}






