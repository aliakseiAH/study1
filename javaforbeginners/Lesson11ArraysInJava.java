package javaforbeginners;

public class Lesson11ArraysInJava {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных
       /* char character = 'a'; //примитивный тип данных
        String s = "Hello";
        String s1 = new String("Hello");*/

        int[] numbers = new int[5]; //numbers ссылается на объект
        for (int i =0; i<numbers.length; i++) {
            numbers[i] = i*10;
        }
        for (int i =0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
    }
}}
