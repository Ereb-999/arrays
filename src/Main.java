import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }

        System.out.println();

        double[] number1 = {1.57, 7.654, 9.986};
        for (int e = 0; e < number1.length; e++) {
            if (e == number1.length - 1) {
                System.out.println(number1[e]);
                break;
            }
            System.out.print(number1[e] + ", ");
        }

        System.out.println();

        int[] status = {1000, 200, 10, 30, 5};
        for (int x = 0; x < status.length; x++) {
            if (x == status.length - 1) {
                System.out.println(status[x]);
                break;
            }
            System.out.print(status[x] + ", ");
        }
        System.out.println();

        for (int i = number.length - 1; i >= 0; i--) {

            System.out.print(number[i] + (i != 0 ? ", " : ""));
        }
        System.out.println();

        for (int e = number1.length - 1; e >= 0; e--) {

            System.out.print(number1[e] + (e != 0 ? ", " : ""));
        }

        System.out.println();

        for (int x = status.length - 1; x >= 0; x--) {

            System.out.print(status[x] + (x != 0 ? ", " : ""));
        }

        System.out.println();


        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number));

        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {

        int[] arr = generateRandomArray();
        double amount = 0;
        for (int i1 : arr) {
            amount += i1;
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей");

        System.out.println("Средняя сумма трат за месяц составила " + amount / (float) arr.length + " рублей");

        int min = arr[0];
        int max = arr[0];

        for (int calculation : arr) {
            if (calculation < min) {
                min = calculation;
            } else if (calculation > max) {
                max = calculation;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}