package com.dbs.beans;

public class PrimeCheck {
    public boolean check(int num) {
        //boolean res = false;
        System.out.println("checking" + num);
        for (int c = 2; c < num; c++) {
            if (num % c == 0) {
                System.out.println("return false" + num);
                return false;
            }
        }
        System.out.println("return true" + num);
        return true;
    }
}
