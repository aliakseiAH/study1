package Methods;
/*
*@author Aliaksei Hardzeyeu
**/
import java.util.Arrays;
import java.util.Scanner;
// Простые числа.
public class b8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo chisel");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(arr));
    simpleNumbers(arr);
    }

    static void simpleNumbers(int [] arr) {


        for (int x:arr) {
            int count=0;
            for (int i = 1; i<=x; i++) {
                if (x%i == 0) {
                    count= count + 1;
                }
            } if (count==2)
                System.out.println(x);
        }
    }
}