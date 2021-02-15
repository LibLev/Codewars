package com.codewars;

public class BraceChecker {

    public boolean isValid(String braces) {
        char[] chars = braces.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i-1] == '(' &&  chars[i-1] == ')'){
                return true;
            }
        }
        return false;
    }

}
