package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LuhnAlgorithmValidatorTests {
    LuhnAlgorithmValidator validator = new LuhnAlgorithmValidator();

    @Test
    public void testInvalidLuhnAlgorithmNumber() {
        boolean result = validator.validate("1234567890123456");
        assertFalse(result);
    }

    @Test
    public void testValidLuhnAlgorithmNumber() {
        boolean result = validator.validate("5462972378746705");
        assertTrue(result);
    }

}
