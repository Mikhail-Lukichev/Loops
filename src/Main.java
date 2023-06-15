// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Task 1. Saving duration");
        int target = 2_459_000;
        int monthlySavings = 15000;
        int total = 0;
        int month = 0;
        while (total < target) {
            total = total + monthlySavings;
            month = month + 1;
            System.out.println("Month " + month + ". Total savings is " + total);
        }
        System.out.println("Target " + target + " was reached in " + month + " months. Total savings is " + total);
    }

    public static void task2() {
        System.out.println("Task 2. 1 to 10 and 10 to 1");
        int i = 1;
        int target = 10;
        while (i <= target) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        target = 1;
        for (; i >= target; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Task 3. Country population change");
        int year = 1;
        int birthRatePerThousand = 17;
        int deathRatePerThousand = 8;
        int population = 12_000_000;
        for (; year <=10; year++) {
            population = population + birthRatePerThousand * population / 1000 - deathRatePerThousand * population / 1000;
            System.out.println("Year " + year + ". Population " + population);
        }
    }

    public static void task4() {
        System.out.println("Task 4.Vasily's savings");
        int total = 15000;
        int interest = 7;
        int month = 0;
        int target = 12_000_000;
        while (total < target) {
            month++;
            total = total + total * interest / 100;
            System.out.println(month + " month. Savings "+ total);
        }
        System.out.println("Vasily needs " + month + " months to reach " + target + " and save " + total);
    }

    public static void task5() {
        System.out.println("Task 5.Vasily's savings with short report");
        int total = 15000;
        int interest = 7;
        int month = 0;
        int target = 12_000_000;
        while (total < target) {
            month++;
            total = total + total * interest / 100;
            if (month % 6 == 0) {
                System.out.println(month + " month. Savings " + total);
            }
        }
        System.out.println("Vasily needs " + month + " months to reach " + target + " and save " + total);

    }

    public static void task6() {
        System.out.println("Task 6. Vasily's savings for a period of time");
        int total = 15000;
        int interest = 7;
        int month = 0;
        int targetYears = 9;
        while (month <= targetYears * 12) {
            month++;
            total = total + total * interest / 100;
            if (month % 6 == 0) {
                System.out.println(month + " month. Savings " + total);
            }
        }
        System.out.println("After " + targetYears + " years Vasily will save " + total);
    }

    public static void task7() {
        System.out.println("Task 7. Fridays");
        int firstFridayDay = 2;
        int monthDays = 31;
        for (int day = firstFridayDay; day <= monthDays; day = day +7) {
            System.out.println("Today is Friday, " + day + ". Report time!");
        }
    }

    public static void task8() {
        System.out.println("Task 8.Comet");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }

}