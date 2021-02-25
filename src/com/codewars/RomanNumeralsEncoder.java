package com.codewars;

import java.util.TreeMap;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class RomanNumeralsEncoder {

    public String solution(int n) {
        return join("", nCopies(n, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }
}
