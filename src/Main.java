import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        extraTask4();
        extraTask5();
        extraTask6();
    }

    // Задача 1
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задача1");
        int year = 2021;
        checkYear(year);
    }

    // Задача 2
    public static void printAppVersion(int deviceOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear == currentYear) {
            if (deviceOS == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
            if (deviceOS == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else {
            if (deviceOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (deviceOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        printAppVersion(clientOS, clientDeviceYear);
    }

    // Задача 3
    public static int deliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance < 100) {
            if (distance > 20) {
                deliveryDays++;
            }
            if (distance > 60) {
                deliveryDays++;
            }
            return deliveryDays;
        } else {
            return 0;
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        int deliveryDistance = 105;
        int days = deliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }

    // Extra task 4
    public static void arrayReverse(int[] array) {
        array = new int[]{3, 2, 1, 6, 5};
        int mid = (int) Math.round(array.length / 2.0); //середина массива
        int tmp1, tmp2; //временные переменные
        for (int i = 0; i < mid; i++) {
            tmp1 = array[i];
            tmp2 = array[array.length - 1 - i];
            array[i] = tmp2;
            array[array.length - 1 - i] = tmp1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void extraTask4() {
        System.out.println("Extra task 4");
        int[] arr = {3, 2, 1, 6, 5};
        arrayReverse(arr);
    }

    // Extra task 5
    public static void findDuplicate(String s) {
        s = "aabccddefgghiijjkk";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] != c[i + 1]) {
                System.out.println("No dubles");
            } else {
                System.out.println("Dubl: " + c[i]);
                return;
            }
        }
    }

    public static void extraTask5() {
        System.out.println("Extra task 5");
        String s1 = "aabccddefgghiijjkk";
        findDuplicate(s1);
    }

    //Extra task 6
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double average(int sum, int length) {
        double avg = (double) sum / length;
        return avg;
    }

    public static void extraTask6() {
        System.out.println("Extra task 6");
        int[] arr = generateRandomArray();
        int sum = sum(arr);
        double avg = average(sum, arr.length);
        System.out.println(avg);
    }
}