package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem5 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(1000, 100000);

        int rightDigit = a % 10;

        System.out.println("a: " + a);
        System.out.println("rightDigit: " + rightDigit);
    }
}
