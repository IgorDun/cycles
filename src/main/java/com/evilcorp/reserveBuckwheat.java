package com.evilcorp;

public class reserveBuckwheat {
    public static void main(String[] args) {
        final int haveMounthEat = 17;
        int needPay = 0;
        for (int i = 0; i/6 <= haveMounthEat && i<100; i = i + 6) {
             needPay = needPay + (100 - i) * 100;
            System.out.println("i = " + i);
        }
        System.out.println("needPay = " + needPay);
    }
}
