package javaforbeginners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson39CheckedUnchecked {
    public static void main(String[] args) {
        // Checked Exceptions (Compile time exception) исключительные случаи
        //Unchecked (Runtime exception) = ошибка в программе,
        // её не нужо обрабатывать, нужно ИСПРАВЛЯТЬ
// checked =>
//        File file = new File("test");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//unchecked, НУЖНО ИСПРАВЛЯТЬ - ОШИБКА ЛОГИКИ
    int[] arr = new int[2];
        System.out.println(arr[2]);

    }
}
