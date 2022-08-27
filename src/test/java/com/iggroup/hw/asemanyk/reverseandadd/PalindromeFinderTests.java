package com.iggroup.hw.asemanyk.reverseandadd;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeFinderTests {
    PalindromeFinder palindromeFinder = new PalindromeFinder();

    @Test
    public void testPalindromeFound() {
        String result = palindromeFinder.findPalindrome(BigInteger.valueOf(125L));
        assertEquals("1 646", result);
    }

    @Test
    public void testPalindromeNotFound() {
        String result = palindromeFinder.findPalindrome(BigInteger.valueOf(196L));
        assertEquals("Palindrome wasn't found within 1000 iterations", result);
    }
}
