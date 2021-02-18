package javaforbeginners;

import java.util.Scanner;

public class ArraySort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = sc.nextInt();
        int[] array = new int[x];
        System.out.println("Введите числа массива через пробел");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int key = 4;
        int index = printResult(array, key);
        System.out.println(key + " индекс " + index);
        sc.close();
    }

    static int printResult(int[] array, int key) {
// int index = 0;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                System.out.println("Ключ найден");
                return middle;
            }
            if (array[middle] < key) {
                System.out.println("Отбрасываем левую часть");
                left = middle + 1;
            }
            if (array[middle] > key) {
                System.out.println("Отбрасываем правую часть");
                left = middle - 1;
            }
            return -1;
        }
        return -2;
    }
}
