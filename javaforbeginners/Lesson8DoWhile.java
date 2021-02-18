package javaforbeginners;

import java.util.Scanner;

public class Lesson8DoWhile {
    /*public static void main(String[] args) { //not very good, code dubliruyetsya!
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi 5");
        int value = scanner.nextInt();
        while (value!=5) {
            System.out.println("vvedi 5");
            value = scanner.nextInt();
        }
        System.out.println("vvedeno " + value);
    }
}*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;                                   //declarorovat` zdes`
        do {
            System.out.println("vvedi 5");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("vvedeno 5");
    }
}