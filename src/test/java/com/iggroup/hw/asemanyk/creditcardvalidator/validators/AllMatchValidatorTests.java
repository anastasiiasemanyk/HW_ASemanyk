package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AllMatchValidatorTests {
    @Mock
    StringValidator firstValidator;
    @Mock
    StringValidator secondValidator;

    @Test
    void verifyAllMatchTrueForOne() {
        when(firstValidator.validate(any())).thenReturn(true);
        AllMatchValidator validator = new AllMatchValidator(List.of(firstValidator));
        assertTrue(validator.validate(""));
    }

    @Test
    void verifyAllMatchTrueForTwo() {
        when(firstValidator.validate(any())).thenReturn(true);
        when(secondValidator.validate(any())).thenReturn(true);
        AllMatchValidator validator = new AllMatchValidator(List.of(firstValidator, secondValidator));
        assertTrue(validator.validate(""));
    }

    @Test
    void verifyAllMatchFalseForTwoDifferent() {
        when(firstValidator.validate(any())).thenReturn(true);
        when(secondValidator.validate(any())).thenReturn(false);
        AllMatchValidator validator = new AllMatchValidator(List.of(firstValidator, secondValidator));
        assertFalse(validator.validate(""));
    }

    @Test
    void verifyAllMatchFalseForTwoSame() {
        when(firstValidator.validate(any())).thenReturn(false);
        AllMatchValidator validator = new AllMatchValidator(List.of(firstValidator, secondValidator));
        assertFalse(validator.validate(""));
    }
}
