package ru.iteco.util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(args[0] + " world! My name is Fedor.");

        int age = 46;
        System.out.printf("My age is %d", age);
        System.out.println();
        String name = "Fedor";
        System.out.printf("%s world! My name is %s.", args[0], name);

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter name:");
        String name2 = scan.next();
        System.out.printf("Name is %s", name2);
        scan.close();

    }

}