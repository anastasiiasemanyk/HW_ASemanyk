package com.iggroup.hw.asemanyk.creditcardvalidator.validators;

import java.util.Collections;
import java.util.List;

public class AllMatchValidator implements StringValidator {
    private final List<StringValidator> validators;

    public AllMatchValidator(List<StringValidator> validators) {
        this.validators = Collections.unmodifiableList(validators);
    }

    @Override
    public boolean validate(String inputNumber) {
        return validators.stream().allMatch(validator -> validator.validate(inputNumber));
    }
}
