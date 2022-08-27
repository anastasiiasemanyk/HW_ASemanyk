package com.iggroup.hw.asemanyk.reverseandadd;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BigIntegerUtil {

    public static BigInteger reverse(BigInteger inputNumber) {
        return new BigInteger(new StringBuilder(inputNumber.toString())
                .reverse()
                .toString());
    }

    public static boolean isPalindrome(BigInteger inputNumber) {
        return inputNumber.equals(reverse(inputNumber));
    }
}
