package com.evilcorp;

public class simpleCycle {
    public static void main(String[] args) {
       for (int i = 0; i < 101; i = i + 1){
            System.out.println("i = " + i);
        }
    }
}
