package com.itacademy.lesson2;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Квадратное уравнение:
//        ax^2+bx+c=0
        System.out.println("Введите переменную a");
        int a = scanner.nextInt();

        System.out.println("Введите переменную b");
        int b = scanner.nextInt();

        System.out.println("Введите переменную c");
        int c = scanner.nextInt();

        //int x;

        // корни квадратного уравнения x1, x2:

        double x1;
        double x2;

       // дискриминант:
       double d = discriminant(a,b,c);
       //double d;


        if (isPositive(d)) {
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b-Math.sqrt(d))/2*a;
            System.out.printf("Корни квадратного уравнения: \n x1=%f;\n x2=%f",x1,x2);
        } else
            if (isZero(d)) {
                x1=(-b+Math.sqrt(d))/2*a;
                System.out.printf("Корень квадратного уравнения: \n x1=%f",x1);
            } else {
                System.out.println("Отрицательный дискриминант. Отсутствуют корни квадратного уравнения");
        }

    }

    private static double discriminant(int a,int b,int c) {
        return Math.pow(b,2) - 4*a*c;
    }

    private static boolean isPositive(double d) {
        if (d > 0) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean isZero(double d) {
        if (d == 0) {
            return true;
        } else {
            return false;
        }
    }
}
