package javaforbeginners;

public class Lesson15Methods {
    public static void main(String[] args) {
        Person2 jim = new Person2();
        jim.name = "Jim";
        jim.age = 20;
        jim.sayHello();
        Person2 nick = new Person2();
        nick.name = "Nick";
        nick.age = 20;
        nick.speak();


    }
}

class Person2 {
    // 1. Данные (поля)
    // 2. Действия кот может совершать (методы)
    String name;
    int age;
    void speak() {
        for (int i = 0; i<3; i++){
        System.out.println("name-" + name + "; age=" + age);
    }}
    void sayHello() {
        System.out.println("Hello");

    }
}

