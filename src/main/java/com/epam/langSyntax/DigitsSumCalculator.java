package com.epam.langSyntax;

import java.util.Scanner;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int digit, sum = 0;

        while(number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println(sum);
    }
}
