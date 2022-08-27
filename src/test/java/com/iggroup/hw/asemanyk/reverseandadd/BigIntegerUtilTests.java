package com.iggroup.hw.asemanyk.reverseandadd;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class BigIntegerUtilTests {

    @Test
    public void testReverse() {
        BigInteger result = BigIntegerUtil.reverse(BigInteger.valueOf(125L));
        assertEquals(BigInteger.valueOf(521L), result);
    }

    @Test
    public void testIsPalindrome() {
        boolean result = BigIntegerUtil.isPalindrome(BigInteger.valueOf(151L));
        assertTrue(result);
    }

    @Test
    public void testIsNotPalindrome() {
        boolean result = BigIntegerUtil.isPalindrome(BigInteger.valueOf(152L));
        assertFalse(result);
    }
}


