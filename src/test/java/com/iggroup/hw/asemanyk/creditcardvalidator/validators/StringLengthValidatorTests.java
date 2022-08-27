package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringLengthValidatorTests {
    StringLengthValidator validator = new StringLengthValidator(2);

    @Test
    public void testCardLengthExceeds() {
        boolean result = validator.validate("123");
        assertFalse(result);
    }

    @Test
    public void testCardLengthCorrect() {
        boolean result = validator.validate("12");
        assertTrue(result);
    }

    @Test
    public void testCardLengthLacks() {
        boolean result = validator.validate("1");
        assertFalse(result);
    }

    @Test
    public void testCardEmptyField() {
        boolean result = validator.validate("");
        assertFalse(result);
    }
}







