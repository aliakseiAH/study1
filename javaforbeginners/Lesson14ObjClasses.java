package javaforbeginners;

public class Lesson14ObjClasses {
    public static void main(String[] args) {
        Person1 jim = new Person1();
        jim.name = "Jim";
        jim.age = 20;
        System.out.println("jim age " + jim.age + " name "+ jim.name);
        Person1 nick = new Person1();
        nick.name = "Nick";
        nick.age = 20;
        System.out.println("nick age " + nick.age + " name "+ nick.name);

    }
}

class Person1 {
    // 1. Данные (поля)
    // 2. Действия кот может совершать (методы)
    String name;
    int age;
}