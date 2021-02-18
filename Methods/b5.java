package Methods;

import java.util.Arrays;
import java.util.Scanner;

//Элементы, расположенные методом пузырька по убыванию модулей.
public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo chisel");
        int n = sc.nextInt();

        int[] numb = new int[n];
        System.out.println("Vvedite chisla massiva");
        for (int i = 0; i < n; i++) {
            numb[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numb));

        bubbleSort(numb);

    }
// int n = arr.length;
//        for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (arr[j] > arr[j+1])
//                {
//                    // swap arr[j+1] and arr[j]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
    public static void bubbleSort (int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j<n-i-1; j++)

                if (Math.abs(array[j]) < (Math.abs(array[j + 1]))) {
                    int max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                }
            }
            System.out.println(Arrays.toString(array));

        }
    }

