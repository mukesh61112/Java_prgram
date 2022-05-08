package com.company;

import java.util.Scanner;
class FindPrimeNumber {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 30;
        int flag = 0;
        System.out.println("Prime numbers  between " + number1 + " and " + number2 + " are= ");
        for (int i = number1; i <= number2; ++i) {
            flag=0;
            for (int j = 2; j <= number1 / 2; ++j) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
}
