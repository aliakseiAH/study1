package javazadachiblog;

// Создать программу, проверяющую и сообщающую на экран, я
// вляется ли целое число записанное в переменную n, чётным либо нечётным.

public class zad31 {
    public static void main(String[] args) {
        int n = 274;

        if (n%2==0) {
            System.out.println("n is even");
        } else System.out.println("n is odd");
    }
}
