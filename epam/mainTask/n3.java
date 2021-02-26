package epam.mainTask;

import java.util.Arrays;
import java.util.Scanner;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i<n; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        for (int x:numbers) {
            System.out.println(x);
        }
        for (int x:numbers) {
            System.out.print(x + " ");
        }
    }
}
