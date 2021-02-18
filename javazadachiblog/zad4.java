package javazadachiblog;

//В переменной n хранится натуральное трёхзначное число. Создайте программу,
// вычисляющую и выводящую на экран сумму цифр числа n.



public class zad4 {
    public static void main(String[] args) {

        int n = 700;
        int x = n / 100;
        int y = (n - x*100) / 10;
        int z = (n - x*100 - y*10);

        int t = x + y + z;
        System.out.println(x + " "+ y + " " +z +" " + t);

    }
}