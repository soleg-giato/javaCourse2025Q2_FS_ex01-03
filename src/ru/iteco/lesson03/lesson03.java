package ru.iteco.lesson03;

import java.util.Arrays;

public class lesson03 {

    public static void main(String[] args) {

        test(21);
        System.out.println("Сумма эл-тов массива: " + sumArr(1, 2, 4, 5));
        System.out.println("Факториал -3 = " + factorial(-3));
        System.out.println("Факториал 1 = " + factorial(1));
        System.out.println("Факториал 15 = " + factorial(15));

        // проверка работы PR
    }

    static void test(int age) {

        if (age >= 18)
            System.out.println("ADULT");
        else
            System.out.println("KID");

    }

    static int sumArr(int... nums) {
        return Arrays.stream(nums).sum();
    }

    static double sumArr(double... nums) {
        return Arrays.stream(nums).sum();
    }

    static int factorial(int num) {
        return num < 1 ? 0 : (num == 1 ? 1 : num * factorial(num - 1));
    }
}
