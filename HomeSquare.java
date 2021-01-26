package com.itacademy.lesson2;

import java.util.Scanner;

public class HomeSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону а дома 1");
        int a = scanner.nextInt();

        System.out.println("Введите сторону b дома 1");
        int b = scanner.nextInt();

        System.out.println("Введите сторону c дома 2");
        int c = scanner.nextInt();

        System.out.println("Введите сторону d дома 2");
        int d = scanner.nextInt();

        System.out.println("Введите сторону e участка");
        int e = scanner.nextInt();

        System.out.println("Введите сторону f участка");
        int f = scanner.nextInt();

        if (isHomesEqualsArea(a,b,c,d,e,f)) {
            System.out.println("Дома вмещаются на участке");
        } else {
            System.out.println("Дома НЕ вмещаются на участке");
        }
    }

    private static boolean isHomesEqualsArea (int a,int b, int c, int d,int e, int f) {
        int squareHomeOne = a*b;
        int squareHomeTwo = c*d;
        int squareArea = e*f;
        int homesLength = a+c;
        int homesWidth = b+d;

        if (squareArea < (squareHomeOne+squareHomeTwo)) {
            return false;
        } else
            if (e < homesLength && f < homesWidth) {
            return false;
        } else
            if ((a > e || c > e) || (b > f || d > f)) {
                return false;
            } else {
                return true;
            }
    }
}
