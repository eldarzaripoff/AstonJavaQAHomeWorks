package ru.netology;

import java.util.Arrays;
import java.util.Random;

import static ru.netology.Tasks.*;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        Random random = new Random();
        int a = random.nextInt(20);
        int b = random.nextInt(20);
        System.out.println(checkSumOfTwoIntegers(a, b));
        int c = random.nextInt();
        checkTheSignOfANumber(c);
        System.out.println(anotherCheckTheSignOfANumber(c));
        String words = "Hello world!";
        int repeats = random.nextInt(5) + 1;
        stringPrinter(words, repeats);
        int year = random.nextInt(9999);
        System.out.println(isTheYearLeap(year));
        arrayChanger();
        arrayFiller();
        multiplyTheArray();
        matrix();
        System.out.println(Arrays.toString(lenAndInitialValue(repeats, a)));

    }


}