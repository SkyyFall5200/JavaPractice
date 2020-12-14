package prac1;

import java.util.Random;
import java.util.Scanner;

public class begin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] i = new int[10];
        System.out.print("Введите 10 целох чисел: ");
        for (int b = 0; b < 10; b++) {
            i[b] = sc.nextInt();
        }
        ForSum(i);
        WhileSum(i);
        DoWhileSum(i);
        Row();
        Sorted();
        Factorial();
    }

    private static void ForSum(int[] i) {
        int sum = 0;
        for (int b = 0; b < 10; b++) {
            sum += i[b];
        }
        System.out.println("For: " + sum);
    }
    private static void WhileSum(int[] i)
    {
        int sum = 0, b = 0;
        while (b < 10)
        {
            sum += i[b];
            b += 1;
        }
        System.out.println("While: " + sum);
    }

    private static void DoWhileSum(int[] i)
    {
        int sum = 0, b = 0;
        do {
            sum += i[b];
            b += 1;
        } while (b < 10);
        System.out.println("DoWhile: " + sum);
    }

    private static void Command(String[] args)
    {
        for (String arg : args) {
            System.out.print(arg);
        }
    }

    private static void Row()
    {
        double m;
        System.out.print("Гармонический ряд: ");
        for (int b = 1; b <= 10; b++) {
            m = 1.0 / b;
            System.out.print(m + " ");
        }
    }

    private static void Sorted()
    {
        final Random random = new Random();
        int length = random.nextInt(50), temp;
        int[] arr = new int[length];
        System.out.println();
        System.out.print("Несортированный массив: ");
        for (int b = 0; b < length; b++) {
            arr[b] = random.nextInt(100);
            System.out.print(arr[b] + " ");
        }
        for (int b = 0; b < length; b++) {
            for (int j = 0; j < length - 1 - b; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (int b = 0; b < length; b++) {
            System.out.print(arr[b] + " ");
        }
    }

    private static void Factorial()
    {
        final Random random = new Random();
        int random1 = random.nextInt(10);
        long fact = 1;
        for (int factorial = 2; factorial <= random1; factorial++) {
            fact *= factorial;
        }
        System.out.println();
        System.out.print("Факториал(" + random1 + "): "+ fact);
    }
}
