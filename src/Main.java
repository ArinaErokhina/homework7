import java.awt.desktop.SystemSleepEvent;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задание 2

        arr = generateRandomArray();

        int minArr = 200000;
        int maxArr = 100000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println("Максимальная трата за месяц составила " + maxArr + " рублей.");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Минимальная трата за месяц составила " + minArr + " рублей.");

        //Задание 3

        arr = generateRandomArray();

        int averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            averageSum = averageSum + arr[i] / 30;
        }
        System.out.println("Средняя сумма трат за месяц " + averageSum + " рублей.");

       //Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int t = 10; t >= 0; t--)
            System.out.print(reverseFullName[t]);


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

}

