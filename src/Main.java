public class Main {
       public static void main(String[] args) {
    //Задача 1
    int i = 0;
    int solary = 0;
    int total = 0;
    while (total < 2_459_000) {
        i = i + 1;
        solary = 15000;
        total = total + solary;
        System.out.println("Месяц"  + i + " сумма накоплений равна" + total);}

    // Задача 2
    int i = 1;
    while (i <= 10) {
        System.out.printf("используя цикл while" + i);
}
    for (int i = 1; i <= 10; i++) {
        System.out.print(" используя оператор for" + i);
    }
    // Задача 3
    int population = 12000000;
    for (int i = 1; i <= 10; i++) {
    int born = 17;
    int death = 8;
        PerYear = population / 1000;
        BirthRate = born * PerYear;
        DeathInYear = death * PerYear;
        total = BirthRate - DeathInYear;
        total = total + total;
        System.out.printf("Год " + i + "численность населения составляет" + total);
}