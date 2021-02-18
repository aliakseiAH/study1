package javazadachiblog;

// В переменные a и b записаны целые числа,
// при этом b больше a. Создайте программу, которая будет
// генерировать и выводить на экран целое псевдослучайное число из отрезка [a;b].


public class zad23 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(Math.round((Math.random()*(b-a) + a)));
    }
}
