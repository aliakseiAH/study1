package Methods;

import java.util.Arrays;
import java.util.Scanner;

//Наибольший общий делитель и наименьшее общее кратное этих чисел.
public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo chisel");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void commonDivisorMultiple(int[] arr) {
        for (int x: arr) {


        }

    }
}
