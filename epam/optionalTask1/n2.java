package epam.optionalTask1;
//Ввести n чисел с консоли.
//Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.Arrays;
import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String[] str = sc.nextLine().split(" ");
        int n = str.length;

        for (int i = 0; i< n-1; i++) {
            for (int j = 0; j< n-i-1; j++) {
                if (str[j].length()>str[j+1].length()){
                String temp = str[j];
                str[j] = str[j+1];
                str[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(str));
        for (int i = 0; i< n-1; i++) {
            for (int j = 0; j< n-i-1; j++) {
                if (str[j].length()<str[j+1].length()){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
}