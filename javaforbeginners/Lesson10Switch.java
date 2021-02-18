package javaforbeginners;

import java.util.Scanner;

public class Lesson10Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input age");
        int age = scanner.nextInt();
        switch (age) {
            case 3:
                System.out.println("u`re born");
                break;
            case 7:
                System.out.println("ure in school");
                break;
            case 18:
                System.out.println("u`d ended school");
                break;
            default:
                System.out.println("nothing ne podoshlo");
        }


    }
}
