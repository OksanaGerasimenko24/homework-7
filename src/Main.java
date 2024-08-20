public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
        int desiredSum = 2_459_000;
        int summa = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (summa < desiredSum) {
            summa += amount;
            summa = (int) (summa * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + summa + " рублей.");
        }
        System.out.println("Задача 2 ");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number + "");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.println(number + "");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertility / 1000 - population * mortality / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        percent = 7D / 100;
        desiredSum = 12_000_000;
        summa += amount;
        month = 0;
        while (summa < desiredSum) {
            summa = (int) (summa * (1 * percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + summa + " рублей.");
        }
        System.out.println("Задача 5");
        summa += amount;
        month = 0;
        while (summa < desiredSum) {
            summa = (int) (summa * (1 * percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + summa + " рублей.");
            }
        }
        System.out.println("Задача 6");
        summa += amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            summa = (int) (summa * (1 * percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + summa + " рублей.");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day +=7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int period = 79;
        int startSeeing = 1;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year < end; year++) {
            if (year % period == startSeeing) {
                System.out.println(year);
            }
        }
    }
}