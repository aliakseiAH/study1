package javazadachiblog;

// Создайте программу, которая будет генерировать и выводить
// на экран вещественное псевдослучайное число из промежутка [-3;3).

import java.util.Random;

public class zad21 {
    public static void main(String[] args) {
        double a = (Math.random()*(3+3)-3);
        System.out.println(a);

    }
}
