package Methods;

import java.util.Arrays;
import java.util.Scanner;

//6.Все трехзначные числа, в десятичной записи которых нет одинаковых
//цифр.

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo chisel");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(arr));

        difNumbers(arr);
    }

    public static void difNumbers(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            if ((arr[i]%10 != ((arr[i]%100 - arr[i]%10)/10)) && ((int)arr[i]/100 != arr[i]%10) && ((arr[i]%100 - arr[i]%10)/10 != (int)arr[i]/100 )) {
                System.out.println(arr[i]);

            }
        }
    }


}
