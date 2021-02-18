package javazadachiblog;

// В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
// Вычислить и вывести на экран площадь треугольника и его периметр.

public class zad25 {
    public static void main(String[] args) {
        double a = 2;
        double b = 2;


        System.out.println("S = " + (a+b)/2 + "; P = " + (a + b + Math.sqrt(a*a + b*b)) + "; c = " + Math.sqrt(a*a + b*b));

        }
    }

