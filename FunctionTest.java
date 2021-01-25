package com.itacademy.lesson2;

public class FunctionTest {
    public static void main(String[] args) {
//        System.out.println(findMax(5,8));
//        System.out.println(findMax(-123,-577));
//        System.out.println(findMax(3513251,55));

//        System.out.println(cube(2));
//        System.out.println(cube(3));
//        System.out.println(cube(5));

//        System.out.println(ischeckIntValue(22));
//        System.out.println(ischeckIntValue(33));
//        System.out.println(ischeckIntValue(-303));

//        System.out.println(isEven(22));
//        System.out.println(isEven(151));
//        System.out.println(isEven(37));

        System.out.println(shiftChar('f', 5));
        System.out.println(shiftChar('k', 3));
        System.out.println(shiftChar('S', 0));

    }

    public static int findMax(int firstValue, int secondValue) {
 /*       if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }   */
        // можно написать короче, с помощью тернарного оператора:
        return firstValue > secondValue ? firstValue : secondValue;
    }

    public static int cube(int value) {
//        return value * value * value;
        // либо другой вариант:
        return (int) Math.pow(value, 3); // возвести в степень 3, приведение к типу int
    }

    public static boolean ischeckIntValue(int value) {
        return value % 10 == 3;
    }

    public static boolean isEven (int value) {
        return value % 2 == 0;
    }

    public static char shiftChar (char value, int shift) {
        return (char) (value + shift);
    }
}
