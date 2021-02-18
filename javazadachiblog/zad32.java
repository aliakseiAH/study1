package javazadachiblog;

// Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
// записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

public class zad32 {
    public static void main(String[] args) {
        double m = 8.75;
        double n = 11.13;

        if ((10-m) > (-(10-n))) {
            System.out.println("K 10 blizhe n " + n);

        }
        if ((10-m) == -((10-n))) {
            System.out.println("Rasstoyaniye ravno" + m + " " + n);
        }

        if ((10-m) < -((10-n))) {
            System.out.println("K 10 blizhe m " + m);
        }
    }
}
