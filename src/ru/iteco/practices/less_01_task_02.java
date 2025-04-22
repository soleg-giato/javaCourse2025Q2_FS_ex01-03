package ru.iteco.practices;

public class less_01_task_02 {

    /**
     * author: Shchukin FN
     * date: 2025.04.02
     * task: lesson 01-02
     * Необходимо вывести форматированную информацию с переменными
     * в зависимости от варианта (должны присутствовать типы:
     * String/char, byte/short/int/long, float/double).
     */

    public static void main(String[] args) {

        // 01
        String city = "Moscow";
        int population = 20_000_000;
        float jobless = (float) (7_326_851 * 100) / population;
        System.out.printf("01. Город: %s, население: %d, безработных, %s: %.2f", city, population, "%", jobless);
        System.out.println();

        // 02
        char section = 'B';
        byte seat = 83;
        double amount = (double) 2_076_452_187.4584321;
        System.out.printf("02. Секция на трибуне: %s, место: %d, стоимость билета: %.2f фунтов", section, seat, amount);
        System.out.println();

        // 03
        String name = "Fedor";
        int age = 46;
        short height = 181;
        System.out.printf("03. Имя: %s, возраст: %d, рост: %d см", name, age, height);
        System.out.println();

        // 04
        String autoLetters = "МАЕ";
        short autoNumbers = 804;
        int weight = 42_000;
        String autoNum = String.format("%s%d%s", autoLetters.charAt(0), autoNumbers, autoLetters.substring(1, 3));
        System.out.printf("04. Номер машины: %s, вес автомобиля: %d", autoNum, weight);
        System.out.println();

        // 05
        String company = "ООО \"ЭЙЧТУСОФТ\"";
        long income = 3_676_542_561_194L;
        float marketShare = (float) (income * 100) / 15_676_542_561_194L;
        System.out.printf("05. Компания: %s, годовой доход: %d, доля на рынке, %s: %.2f", company, income, "%", marketShare);
        System.out.println();

        // 06
        char rh = '+';
        byte group = 2;
        float partRh = 32.876f;
        System.out.printf("06. Группа крови: %d%s, доля людей с этой группой крови, %s: %.2f", group, rh, "%", partRh);
        System.out.println();

        // 07
        String vuz = "\"МГТУ им.Н.Э.Баумана\"";
        short studentsQty = 24_000;
        float expelledPerc = 12.00f;
        System.out.printf("07. Название универа: %s, число студентов: %d, доля отчисленных, %s: %.2f", vuz, studentsQty, "%", expelledPerc);
        System.out.println();

        // 08
        String rate = "R+";
        long copies = 2_365_987_751L;
        float rating = 8.1f;
        // здесь тавтология получается, но такое задание
        System.out.printf("08. Рейтинг фильма: %s, продано копий: %d, рейтинг: %.1f", rate, copies, rating);
        System.out.println();

        // 09
        String brandName = "Philips";
        int producedQty = 768_342;
        float salesPerc = (float) (489_082 * 100) / producedQty;
        System.out.printf("09. Название бренда: \"%s\", произведено товара: %d, процент продаж, %s: %.2f", brandName, producedQty, "%", salesPerc);
        System.out.println();

        // 10
        char goodsCategory = 'q';
        long barcode = 6487987564654876L;
        float customerOver30yo = 47.83f;
        System.out.printf("10. Категория товара: \"%s\", штрихкод: %d, процент покупателей старше 30 лет, %s: %.2f", goodsCategory, barcode, "%", customerOver30yo);
        System.out.println();

    }
}

