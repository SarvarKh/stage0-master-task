package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0){
            System.out.println("division by zero");
        }else {
            double res = dividend / divider;
            res = res * divider;
            if ((int) res == divider) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }
    }

}
