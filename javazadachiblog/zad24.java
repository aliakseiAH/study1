package javazadachiblog;

//Вычислить и вывести на экран косинусы углов в 60, 45 и 40
// градусов без использования функции Math.toDegrees(n).

public class zad24 {
    public static void main(String[] args) {
        double cos60 = Math.cos(Math.PI/3);
        double cos45 = Math.cos(Math.PI/4);
        double cos40 = Math.cos(Math.PI/4.5);

        System.out.println("cos 60= " + cos60 + "; cos 45=" + cos45 + "; cos 40=" + cos40);
    }
}
