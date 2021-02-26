package javazadachiblog;
//В переменной n хранится вещественное число с ненулевой дробной частью.
// Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.


public class zad3 {
    public static void main(String[] args) {
        double n = -0.5;
        int x = (int) n;

        var r = 1;

        int j = 'ъ';
        int y = j + 1;
        char ch = 1098;
        System.out.println(y + " " + ch);

        Integer number = 32;
        // Binary number format
        String convert = Integer.toBinaryString(number);
        System.out.print(convert + " ");
        // Octagonal number format
        convert = Integer.toOctalString(number);
        System.out.print(convert + " ");
        // Hexadecimal number format
        convert = Integer.toHexString(number).toUpperCase();
        System.out.print(convert + " ");


//    if ((Math.abs(n)- Math.abs(x))>=0.5) {
//        if (n<0) {
//            System.out.println(x-1);
//        } else {
//            System.out.println(x+1);
//        }
//    } else {
//        System.out.println(x);
//    }
//
//
    }
}
