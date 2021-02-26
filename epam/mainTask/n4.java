package epam.mainTask;

import java.util.Arrays;
import java.util.Scanner;

// Ввести целые числа как аргументы командной строки, подсчитать их сумму
// (произведение) и вывести результат на консоль.
public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String[] stringNumbers = sc.nextLine().split(" ");
        int[] numbers = new int[stringNumbers.length];
        int sum = 0;
        int product = 1;

        for (int i = 0; i<stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        for (int x:numbers) {
            sum = sum + x;
            product = product*x;
        }
        System.out.println("Sum is " + sum + "; product is " + product);

    }
}
