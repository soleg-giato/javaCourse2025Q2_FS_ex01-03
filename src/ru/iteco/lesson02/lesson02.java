package ru.iteco.lesson02;

public class lesson02 {
    public static void main(String[] args) {

        int[] arrInt = {126, 689, 98798, 6363, 0};
        System.out.printf("%d, %d, %d", arrInt[2], arrInt[4], arrInt[0]);
        System.out.println();

        char[] arrChar = new char[5];
        System.out.printf("char(1) = \"%s\"", arrChar[1]);
        System.out.println();

        int age = 10;
        switch (age) {
            case 10:
            case 20:
            case 22:
            case 30: System.out.printf("age = %d", age); break;
            default:
                throw new IllegalStateException("Unexpected value: " + age);
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt(%d) = %d", i, arrInt[i]);
            System.out.println();
        }

    }
}
