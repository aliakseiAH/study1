package javazadachiblog;
//В переменной n хранится вещественное число с ненулевой дробной частью.
// Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.


public class zad3 {
    public static void main(String[] args) {
        double n = -0.5;
        int x = (int) n;


    if ((Math.abs(n)- Math.abs(x))>=0.5) {
        if (n<0) {
            System.out.println(x-1);
        } else {
            System.out.println(x+1);
        }
    } else {
        System.out.println(x);
    }


    }
}
