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
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Task 1. 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void task2() {
        System.out.println("Task 2. 10 to 1. ");
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void task3() {
        System.out.println("Task 3. Even numbers only");
        for (int i = 0; i <=17; i++) {
            if ( i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void task4() {
        System.out.println("Task 4. 10 to -10");
        for (int i = 10; i >= -10; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void task5() {
        System.out.println("Task 5. Leap years");
        int startYear = 1904;
        int finishYear = 2096;
        for (int i = startYear; i <= finishYear; i = i + 4) {
            if (i % 100 != 0 || i % 400 == 0) {
                System.out.println("Year " + i);
            }
        }
    }

    public static void task6() {
        System.out.println("Task 6. 7 to 98, every seventh");
        for (int i = 7; i <=98; i = i + 7) {
            System.out.println("i = " + i);
        }
    }

    public static void task7() {
        System.out.println("Task 7. 1 to 512, next number is multiplied by two");
        for (int i = 1; i <= 512; i = i * 2 ) {
            System.out.println("i = " + i);
        }
    }

    public static void task8() {
        System.out.println("Task 8. Savings increase");
        int monthlySavings = 29000;
        int totalSavings = 0;
        for (int i = 1; i <= 12; i++){
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Month " + i + ". Total savings amount " + totalSavings);
        }
    }

    public static void task9() {
        System.out.println("Task 9.Savings increase with interest");
        int monthlySavings = 29000;
        int totalSavings = 0;
        int interest = 12;
        for (int i = 1; i <= 12; i++){
            totalSavings = totalSavings + totalSavings * interest / 100 / 12;
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Month " + i + ". Total savings amount " + totalSavings);
        }
    }

    public static void task10() {
        System.out.println("Task 10. Multiplication table");
        int baseNumber = 2;
        for (int i = 1; i <= 10; i++) {
            int result = baseNumber * i;
            System.out.println(baseNumber + " * " + i + " = " + result);
        }
    }

}