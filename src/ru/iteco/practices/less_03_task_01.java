package ru.iteco.practices;

import java.util.Scanner;

public class less_03_task_01 {

    static String name;
    static int number;

    /**
     * author: Shchukin FN
     * date: 2025.04.18
     * task: lesson 03-01 (05)
     * Задача выложена в виде картинки
     */

    public static void main(String[] args) {

        validate();
        System.out.println("Имя = " + name);
        System.out.println("Число = " + number);
        int sum = getSum(0, number);

        String res = num2words(sum);
        System.out.println("Сумма цифр в числе = " + sum);
        System.out.printf("Здравствуй, %s! Сумма цифр в числе = %s", name, res);
        System.out.println();
    }

    static int getSum(int acc, int number) {
        if (number < 10)
            return acc += number;
        else
            return getSum(acc + number % 10, number / 10);
    }

    static void validate() {
        String input = "";
        int validNum = 1;

        // в цикле добиваемся ввода валидных входных данных
        while (validNum > 0) {

            // читаем входные данные
            input = getData();
            System.out.printf("Пришли такие данные: \"%s\"", input);
            System.out.println();

            // валидируем входные данные
            String validInfo = validInfo(input);
            System.out.printf("Результат валидации входных данных: %s", validInfo);
            System.out.println();

            validNum = validCode(input);
        }

        System.out.println("Вышли из цикла валидации.");
        name = input.trim().split(" ")[0];
        number = Integer.parseInt(input.trim().split(" ")[1].trim());
    }


    static String getData() {
        System.out.print("Введите строку с именем и числом (2-5 разрядов): ");
        Scanner scr = new Scanner(System.in);
        String res = scr.nextLine();
//        scr.close();

        return res;
    }

    static String validInfo(String input) {
        String res = "";
        switch (validCode(input)) {
            case 0:
                res = "ОК - Входные данные прошли все проверки.";
                break;
            case 1:
                res = "01 - Укажите непустое имя.";
                break;
            case 2:
                res = "02 - Укажите непустое число";
                break;
            case 3:
                res = "03 - Введенное число не в диапазоне 10..99999.";
                break;
            default:
                res = "Неизвестная ошибка.";
        }

        return res;
    }

    static int validCode(String input) {
        String[] inputArr = input.trim().split(" ");
        int res = 0;

        // Укажите непустое имя
        res = inputArr[0].trim().isEmpty() ? 1 : res;

        if (inputArr.length > 1) {
            // Укажите непустое число
            res = inputArr[1].trim().isEmpty() ? 2 : res;

            if (res != 2) {
                // Не в диапазоне 10..99999
                int nums = Integer.parseInt(inputArr[1].trim());
                res = (nums < 10 || nums > 99999) ? 3 : res;
            }
        } else res = 2;

        return res;
    }


    // Реализация метода ЧислоВСлово =================================================

    private static final String[] dig1 = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private static final String[] dig10 = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] dig20 = {"двадцать", "тридцать", "сорок", "пятьдесят",
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};

    // рекурсивная функция преобразования целого числа в слова
    private static String num2words(int num) {
        StringBuilder words = new StringBuilder(50);

        if (num == 0) words.append("ноль ");
        int d = num / 10;  // цифра десятков
        int n = num % 10;  // цифра единиц

        switch (d) {
            case 0:
                break;
            case 1:
                words.append(dig10[n]).append(" ");
                break;
            default:
                words.append(dig20[d - 2]).append(" ");
        }
        words.append(dig1[n - 1]).append(" ");

        return words.toString().trim();
    }

}
