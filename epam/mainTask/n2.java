package epam.mainTask;
// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arguments: ");
        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = new String[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
