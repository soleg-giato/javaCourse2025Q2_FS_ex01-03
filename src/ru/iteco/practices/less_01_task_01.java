package ru.iteco.practices;

public class less_01_task_01 {

    static void prn(String str, String[] args) {
        System.out.printf(str, args);
        System.out.println();
    }

    /**
     * author: Shchukin FN
     * date: 2025.04.01
     * task: lesson 01-01
     * Создать при помощи обычного вывода картинку дома
     * при помощи String output = "_________/...\n" и т.л.
     * (Используйте спецсимволы).
     */

    public static void main(String[] args) {

        String gap = "__";

        prn("%s%s%s%s%s%s%s%s\' \"%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s%s%s%s%s---%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s%s%s_/\\_|_|%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s%s%s/%s\\|_|%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s%s_/%s%s\\_|%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s%s/%s%s%s\\|%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s_/%s[%s]%s\\%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s/|%s%s%s%s|\\%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s_/_|%s%s%s%s|_\\%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s_|%s----%s|_%s%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
        prn("%s%s%s%s_|%s|  |%s|_%s%s%s", new String[] {gap, gap, gap, gap, gap, gap, gap, gap, gap, gap, gap});
    }
}
