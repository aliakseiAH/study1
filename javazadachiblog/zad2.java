package javazadachiblog;

//В переменной n хранится натуральное двузначное число. Создайте программу,
// вычисляющую и выводящую на экран сумму цифр числа n.


public class zad2 {
    public static void main(String[] args) {
       int n = 98;
       int x = n%10;
       int y = (n-x)/10;

       int z = x+y;

       System.out.println(x + " " + y + " " + z);

    }
}
