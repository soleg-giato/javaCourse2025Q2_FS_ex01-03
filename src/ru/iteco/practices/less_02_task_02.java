package ru.iteco.practices;

import java.util.Random;
import java.util.Scanner;

public class less_02_task_02 {




    /**
     * author: Shchukin FN
     * date: 2025.04.02
     * task: lesson 02-02 (04)
     * Задача выложена в виде картинки
     */

    public static void main(String[] args) {

        int[][] arr2D = new int[4][3];

        // заполним рандомно массив чисел
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arr2D[i][j] = rd.nextInt(1200) + 2 * i;
            }
        }
        System.out.println("Сгенерирован массив строк:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Готово.");

        /* Раскомментировать для желающих вводить руками значения

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Укажите элемент массива (%d, %d):", i, j);
                arr2D[i][j] = scan.nextInt();
                System.out.println();
            }
        }
        System.out.println("Готово.");

         */

        // 01 - строка Х: сумма элементов по строке
        System.out.println("==== Задание 01 - строка Х: сумма элементов по строке =================");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr2D[i][j];
            }
            System.out.printf("Line %d: %d", i, sum);
            System.out.println();
        }

        // 02 - столбец Y: сумма элементов в стобце
        System.out.println("==== Задание 02 - столбец Y: сумма элементов в стобце =================");
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += arr2D[i][j];
            }
            System.out.printf("Column %d: %d", j, sum);
            System.out.println();
        }

        // 03 - замена нечетных на 1, четных на 0, вывод массива на экран
        System.out.println("==== Задание 03 - замена нечетных на 1, четных на 0, вывод массива на экран =================");
        int[][] arr2D_02 = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arr2D_02[i][j] = arr2D[i][j] % 2 == 0 ? 0 : 1;
            }
        }
        System.out.println("Измененный массив строк:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2D_02[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Готово.");

        // 04 - целое среднее арифметическое в строке
        System.out.println("==== Задание 04 - целое среднее арифметическое в строке =================");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr2D[i][j];
            }
            sum = sum / 3;
            System.out.printf("Avg in line %d: %d", i, sum);
            System.out.println();
        }

        // 05 - преобразовать двумерный массив в перевернутый одномерный и вывести его на экран
        System.out.println("==== Задание 05 - преобразовать двумерный массив в перевернутый одномерный и вывести его на экран =================");
        int[] arr1D = new int[12];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arr1D[12 - (i * 3 + j) - 1] = arr2D[i][j];
            }
        }
        System.out.print("Перевернутый обномерный массив: ");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
        System.out.println();
    }

}
