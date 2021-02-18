package javazadachiblog;

//Натуральное положительное число записано в переменную n. Создайте программу,
//которая будет генерировать и выводить на экран
// целое псевдослучайное число из отрезка [-n;n].


public class zad22 {
    public static void main(String[] args) {
        double n = 3;
        System.out.println(Math.round (Math.random()*(Math.abs(n) - (-(Math.abs(n))))-Math.abs(n)));

    }
}
