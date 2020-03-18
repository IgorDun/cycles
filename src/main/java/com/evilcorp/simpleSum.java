package com.evilcorp;

public class simpleSum {
    public static void main(String[] args) {
        int sumGeo = 0;
        for (int i = 1; i <= 100; i = i + 1) {
            sumGeo = sumGeo + i;
        }
        System.out.println("sumGeo = " + sumGeo);
    }
}
