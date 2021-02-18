package javaforbeginners.Lesson36ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ReadingFromFile {
//    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = "c:" + separator + "study1" + separator + "javaforbeginners" + separator + "Lesson36ReadingFromFile" + separator + "test.txt";
//        //c:\study1\javaforbeginners\Lesson36ReadingFromFile
//        File file = new File("test");
//
//        Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();
//        String[] numbersString = line.split(" ");
//        System.out.println(Arrays.toString(numbersString));
//
//        int[] numbers = new int[3];
//        for (int i = 0; i<numbersString.length; i++) {
//            numbers[i] = Integer.parseInt(numbersString[i]);
//        }
//
//        System.out.println(Arrays.toString(numbers));
//
//        scanner.close();
//
//    }
//
//}
