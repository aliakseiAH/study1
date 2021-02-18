package javaforbeginners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37Exceptions {
    public static void main(String[] args) {
        try {
            readfile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }


    }

    public static void readfile() throws FileNotFoundException {
        File file = new File("asd");
        Scanner scanner = new Scanner(file);
    }
}