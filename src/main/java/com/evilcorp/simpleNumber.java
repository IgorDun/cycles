package com.evilcorp;

public class simpleNumber {
    public static void main(String[] args) {
        final int simpleNumber = 11;
        for (int i = 2; i < simpleNumber; i++) {
            if (simpleNumber % i == 0) {
                System.out.println(simpleNumber + " - notSimpleNumber");
                return;
            }

        }
        System.out.println(simpleNumber + " - simpleNumber");
    }
}
