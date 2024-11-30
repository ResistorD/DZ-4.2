public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 4.2");

        System.out.println("Задача 1");

        int total = 0;
        int numberOfMonths = 0;
        while (total <= 2459000) {
            numberOfMonths = numberOfMonths + 1;
            total = total + 15000;
        }
        System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + total);

        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");

        int population = 12000000;
        int fertility;
        int mortality;
        for (i = 1; i <= 10; i++) {
            fertility = 17 * population / 1000;
            mortality = 8 * population / 1000;
            population = population + fertility - mortality;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

        System.out.println("Задача 4");

        int savingsAmount = 15000;
        i = 0;
        while (savingsAmount <= 12000000) {
            i++;
            savingsAmount += savingsAmount * 0.07;
            System.out.println("Месяц " + i + ", сумма накоплений " + savingsAmount);
        }

        System.out.println("Задача 5");

        savingsAmount = 15000;
        i = 0;
        while (savingsAmount <= 12000000) {
            i++;
            savingsAmount += savingsAmount * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + savingsAmount);
            }
        }

        System.out.println("Задача 6");

        savingsAmount = 15000;
        i = 0;
        while (i < 108) {
            i++;
            savingsAmount += savingsAmount * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + savingsAmount);
            }
        }

        System.out.println("Задача 7");

        int firstFriday = 1;
        int day;
        for (day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача 8");

        int currentYear = 2024;
        int startYear;
        int beforeTheCurrent = currentYear - 200;
        int afterTheCurrent = currentYear + 100;
        for (startYear = 0; startYear < afterTheCurrent; startYear += 79) {
            if (startYear > beforeTheCurrent) {
                System.out.println(startYear);
            }
        }

    }
}