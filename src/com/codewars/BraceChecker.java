package com.codewars;

import java.util.*;


public class BraceChecker {
    public boolean isValid(String braces) {
        String[] arr = braces.split("");
        Stack<String> s = new Stack<>();
        for(String i : arr){
            if(i.equals("(")||i.equals("{")||i.equals("[")){
                s.push(i);
            }
            else{
                if(s.empty()){
                    return false;
                }
                if(i.equals("]")&& s.peek().equals("[")){
                    s.pop();
                    continue;
                }
                if(i.equals(")")&& s.peek().equals("(")){
                    s.pop();
                    continue;
                }
                if(i.equals("}")&& s.peek().equals("{")){
                    s.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return (s.empty());
    }
}


