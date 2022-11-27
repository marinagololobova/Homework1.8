import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1");

        System.out.println("Задание 1");
        int gol = 2459000;
        int deposit = 15000;
        double total = 0;
        int month = 0;
        double percent = 0.01;
        while (total <= gol) {
            total = (total + deposit) * (1 + percent);
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i += 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int growth = birthRate - mortality;
        for (int year = 1; year <= 10; year++) {
            population += population * growth / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }


        System.out.println("Домашнее задание 2");

        System.out.println("Задание 1");
        int gol1 = 12_000_000;
        int countMonth = 1;
        int amountOfSavings = 15000;
        double percent1 = 0.07;
        for (; amountOfSavings <= gol1; countMonth++) {
            amountOfSavings += amountOfSavings * percent1;
            System.out.println("Месяц " + countMonth + " сумма накоплений равна " + amountOfSavings + " рублей");

        }

        System.out.println("Задание 2");
        int gol2 = 12_000_000;
        int countMonth2 = 1;
        int amountOfSavings2 = 15000;
        double percent2 = 0.07;
        for (; amountOfSavings2 <= gol2; countMonth2++) {
            amountOfSavings2 += amountOfSavings2 * percent2;
            if (countMonth2 % 6 == 0) {
                System.out.println("Месяц " + countMonth2 + " сумма накоплений равна " + amountOfSavings2 + " рублей");
            }
        }


        System.out.println("Задание 3");
        int countMonth3 = 1;
        int amountOfSavings3 = 15000;
        double percent3 = 0.07;
        for (; countMonth3 <= 108; countMonth3++) {
            amountOfSavings3 += amountOfSavings3 * percent3;
            if (countMonth3 % 6 == 0) {
                System.out.println("Месяц " + countMonth3 + " сумма накоплений равна " + amountOfSavings3 + " рублей");
            }
        }

        System.out.println("Задание 4");
        for (int dayNumber = 2; dayNumber <= 31; dayNumber += 7) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет.");
        }


        System.out.println("Домашнее задание 3");

        System.out.println("Задание 1");
        int age = 0;
        int nowAge = LocalDate.now().getYear();
        int startAge = nowAge - 200;
        int finishAge = nowAge + 100;
        int period = 79;
        for (; age >= 0; age++) {
            if (age >= startAge && age <= finishAge && age % period == 0) {
                System.out.println(age);
            }
        }

        System.out.println("Задание 2");
        int number = 2;
        for (int a = 1; a <= 9; a++) {
            int sum = number * a;
            System.out.println(number + " * " + a + " = " + sum);
        }

    }
}