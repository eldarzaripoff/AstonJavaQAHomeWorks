package ru.netology;

import java.util.Arrays;
import java.util.Random;

public class Tasks {
    static Random random = new Random();

    public static void printThreeWords() {
        System.out.print("""
                Orange
                Banana
                Apple
                """);
    }

    public static void checkSumSign() {
        int a = random.nextInt();
        int b = random.nextInt();
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        Random random = new Random();
        int value = random.nextInt();
        if (value <= 0) System.out.println("Красный");
        if (value > 0 && value <= 100) System.out.println("Желтый");
        if (value > 100) System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        if (a>=b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
    public static boolean checkSumOfTwoIntegers(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void checkTheSignOfANumber(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }
    public static boolean anotherCheckTheSignOfANumber(int a) {
        return a < 0;
    }

    public static void stringPrinter(String words, int repeats) {
        for (int i = 0; i < repeats; i++) {
            System.out.println(words);
        }
    }

    public static boolean isTheYearLeap(int year) {
        return (year % 100 != 0 && year % 4 == 0) || (year % 400 == 0);
    }

    public static void arrayChanger() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayFiller() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void multiplyTheArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i]= array[i] * 2;

        }
        System.out.println(Arrays.toString(array));
    }

    public static void matrix() {
        int[][] array = new int[11][11];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                    array[i][array.length - i - 1] = 1;
                }

            }
        }
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[] lenAndInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
