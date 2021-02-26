package epam.mainTask;

import java.util.Scanner;

//Приветствовать любого пользователя при вводе его имени через командную строку.
public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("Hello, " + sc.nextLine() + "!");
    }
}
