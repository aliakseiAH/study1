package javazadachiblog;

//Создать программу, выводящую на экран случайно
// сгенерированное трёхзначное натуральное число и его наибольшую цифру.

public class zad35 {
    public static void main(String[] args) {
        int x = (int) (Math.random()*9);
        int y = (int) (Math.random()*9);
        int z = (int) (Math.random()*9);

        int n = x + 10*y + 100*z;

        if ((x>y)&&(x>z)) {
            System.out.println("n= " + n + " biggest number is " + x);
        }if ((y>x)&&(y>z)) {
            System.out.println("n= " + n + " biggest number is " + y);
        }if ((z>y)&&(x<z)) {
            System.out.println("n= " + n + " biggest number is " + z);
        }


    }
}
