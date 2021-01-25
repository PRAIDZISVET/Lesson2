package com.itacademy.lesson2;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите нужную сумму денег в рублях");
        int rubles = scanner.nextInt();

        int lastDigit = rubles % 10;
        int lastTwoDigit = rubles % 100;
        if ((5<=lastDigit && 9>= lastDigit || lastDigit == 0) || (15<=lastTwoDigit && 19>=lastTwoDigit)) {
            System.out.println(rubles + " рублей");
        } else if (2<=lastDigit && 4>= lastDigit) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рубль");
        }

        /*  Мое решение:
      int inputValue = scanner.nextInt();
        int x = 10;
        int y = inputValue%x;

        if (11<=inputValue && 14>=inputValue) {
            System.out.println(inputValue + " рублей");
        } else
        if (inputValue==1|| y==1) {
            System.out.println(inputValue + " рубль");
        } else
            //    if (inputValue==3||inputValue==4||inputValue==5) {
            if (inputValue==2||inputValue==3||inputValue==4|| y==2||y==3||y==4) {
                System.out.println(inputValue + " рубля");
            } else System.out.println(inputValue + " рублей");
   */     //  System.out.println(inputValue);

    }
}

