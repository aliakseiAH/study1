package epam.optionalTask1;
//Ввести n чисел с консоли.
//Вывести на консоль те числа, длина которых меньше
//(больше) средней длины по всем числам, а также длину.

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String[] str = sc.nextLine().split(" ");
        int temp = 0;


        for (int i = 0; i < str.length; i++) {
            temp = temp + str[i].length();
        }

        int averageLength = Math.round(temp / str.length);
        System.out.println("averageLength = " + averageLength);

        for (String x : str) {
            if (x.length() > averageLength) {
                System.out.println("Number`s " + x + " length is longer than average. Length is " + x.length() + ".");
            } else if (x.length() < averageLength) {
                System.out.println("Number`s " + x + " length is shorter than average. Length is " + x.length() + ".");
            }

        }

    }
}
