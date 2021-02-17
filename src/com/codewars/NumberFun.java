package com.codewars;

public class NumberFun {
    public static long findNextSquare(long sq) {
        long x = (long) Math.floor(Math.sqrt(sq));
        if((x - Math.sqrt(sq)) == 0){
            return (long) Math.pow(++x,2);
        }
        return -1;
    }
}
