package ru.iteco.practices;

public class less_02_task_01 {

    /**
     * author: Shchukin FN
     * date: 2025.04.02
     * task: lesson 02-01 (03)
     * Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.     *
     * 1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются
     * чётными числами.     *
     * 2.Напишите программу, которая выводит все двузначные числа массива.     *
     * 3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.     *
     * 4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.     *
     * 5.***Напишите программу, которая переворачивает массив в обратном порядке.
     */

    public static void main(String[] args) {

        int[] arrInt = {3, 22, 1, 13, 4, 6, 16, 5};

        // 01
        System.out.print("01. Чётные числа массива:");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 0) System.out.print(arrInt[i] + " ");
        }
        System.out.println();

        // 02
        System.out.print("02. Двузначные числа массива:");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > 9 && arrInt[i] < 100) System.out.print(arrInt[i] + " ");
        }
        System.out.println();

        // 03
        int maxInt = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > maxInt) maxInt = arrInt[i];
        }
        System.out.printf("03. Наибольшее число массива: %d", maxInt);
        System.out.println();

        // 04
        int sumInt = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sumInt += arrInt[i];
        }
        System.out.printf("04. Сумма элементов массива: %d", sumInt);
        System.out.println();

        // 05 - никто не просил создавать новый массив, просили просто перевернуть
        System.out.println("05. Массив в обратном порядке:");
        for (int i = arrInt.length - 1; i >= 0; i--) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
    }

}
