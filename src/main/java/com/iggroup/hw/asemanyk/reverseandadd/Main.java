package com.iggroup.hw.asemanyk.reverseandadd;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final PalindromeFinder palindromeFinder = new PalindromeFinder();

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter numbers < 4,294,967,295 followed by empty line");
        List<BigInteger> numbers = new LinkedList<>();
        while (true) {
            String inputString = inp.nextLine();
            if (inputString.isEmpty()) {
                break;
            }
            if (!inputString.matches("[0-9]+")) {
                throw new NumberFormatException("Provided value is not an integer");
            }
            numbers.add(new BigInteger(inputString));
        }
        numbers.stream()
                .map(palindromeFinder::findPalindrome)
                .forEach(System.out::println);
    }
}

