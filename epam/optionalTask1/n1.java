package epam.optionalTask1;

//Ввести n чисел с консоли.
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String[] str = sc.nextLine().split(" ");
        String big = str[0];
        String small = str[0];
        int max = str[0].length();
        int min = str[0].length();

        for (String value : str) {
            if (value.length() > max) {
                max = value.length();
                big = value;
            }
        }
        for (String s : str) {
            if (s.length() < min) {
                min = s.length();
                small = s;
            }
        }
        System.out.println("small=" + small);
        System.out.println("big =" + big);
        System.out.println("Longest number: " + big + " length: " + max + "; shortest number: " + small + " length: " + min);

    }
}
