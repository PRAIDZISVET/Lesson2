package com.itacademy.lesson2;

import java.util.Scanner;

public class TwoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String firstWord = scanner.next();
        System.out.println("Введите второе слово");
        String secondWord = scanner.next();

        checkWord(firstWord, secondWord);
        System.out.println();
    }

    private static void checkWord(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            System.out.println("Отлично! Слова одинаковы.");
        } else
        if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("Хорошо. Почти одинаковы.");
        } else
        if (firstWord.length() == secondWord.length()) {
            System.out.println("Ну, хотя бы они одной длины.");
        } else {
            System.out.println("Увы!");
        }
    }
}
