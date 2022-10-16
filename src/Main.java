public class Main {
    public static void main(String[] args) {
        //Задача 1
        int i = 0;
        int solary = 15000;
        int total = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + solary;
            System.out.println("Месяц" + i + " сумма накоплений равна" + total);
        }

        // Задача 2
        int i = 1;
        while (i <= 10) {
            System.out.printf("используя цикл while" + i);
            i++;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(" используя оператор for" + i);
        }
        // Задача 3

        int born = 17;
        int death = 8;
        int population = 12000000;
        int perYear = population / 1000;
        int birthRate = born * perYear;
        int deathInYear = death * perYear;
        for (int i = 1; i <= 10; i++) {
            total = birthRate - deathInYear;
            total = total + total;
            System.out.printf("Год " + i + "численность населения составляет" + total);
        }