package javazadachiblog;

// Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
// целое число в интервал (25;100) и сообщать результат на экран.

public class zad34 {
    public static void main(String[] args) {
        double x = (int) (Math.random()*(155-5) + 5);
        if ((x>25)&&(x<100)) {
            System.out.println(x + " Prinadlejit (25;100)");
        } else System.out.println(x + " Ne prinadlejit");
    }
}
