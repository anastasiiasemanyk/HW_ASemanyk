package com.iggroup.hw.asemanyk.creditcardvalidator;

import com.iggroup.hw.asemanyk.creditcardvalidator.validators.AllMatchValidator;
import com.iggroup.hw.asemanyk.creditcardvalidator.validators.LuhnAlgorithmValidator;
import com.iggroup.hw.asemanyk.creditcardvalidator.validators.StringLengthValidator;
import com.iggroup.hw.asemanyk.creditcardvalidator.validators.StringPatternValidator;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static final AllMatchValidator CARD_VALIDATOR = new AllMatchValidator(
            List.of(
                    new StringLengthValidator(16),
                    new StringPatternValidator("^\\d+$"),
                    new LuhnAlgorithmValidator()
            ));

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter card number or press enter to exit");
            String inputString = inp.nextLine();
            if (inputString.isEmpty()) {
                break;
            }
            System.out.println(CARD_VALIDATOR.validate(inputString));
        }
    }
}

