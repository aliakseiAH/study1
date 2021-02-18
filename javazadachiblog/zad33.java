package javazadachiblog;

/*
В три переменные a, b и c записаны три вещественных числа. Создать программу,
        которая будет находить и выводить на экран вещественные корни квадратного
        уравнения ax²+bx+c=0, либо сообщать, что корней нет.
*/

public class zad33 {
    public static void main(String[] args) {
        double a = 5.7;
        double b = 4.11;
        double c = 0.27;

        if ((b*b - 4*a*c)>=0) {
            System.out.println("x1 = " + ((-b + Math.sqrt(b*b - 4*a*c))/2*a) + " x2 = " + ((-b - Math.sqrt(b*b - 4*a*c))/2*a));
        } else System.out.println("Equation doesn`t have any roots");
    }
}
