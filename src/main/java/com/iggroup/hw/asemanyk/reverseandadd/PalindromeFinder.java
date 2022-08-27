package com.iggroup.hw.asemanyk.reverseandadd;

import java.math.BigInteger;

public class PalindromeFinder {

    public String findPalindrome(BigInteger inputNumber) {
        int iterationsNumber = 0;
        while (!BigIntegerUtil.isPalindrome(inputNumber)) {
            inputNumber = inputNumber.add(BigIntegerUtil.reverse(inputNumber));
            iterationsNumber++;
            if (iterationsNumber >= 1000) {
                return "Palindrome wasn't found within 1000 iterations";
            }
        }
        return iterationsNumber + " " + inputNumber;
    }
}









