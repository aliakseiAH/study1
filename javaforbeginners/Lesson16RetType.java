package javaforbeginners;

public class Lesson16RetType {
    public static void main(String[] args) {
        Person3 person = new Person3();
        person.age = 35;
        System.out.println(person.calculateYearsToRetirement());
        Person3 pers = new Person3();
        pers.age = 43;
        System.out.println(pers.calculateYearsToRetirement());
    }
}
class Person3 {
    // 1. Данные (поля)
    // 2. Действия кот может совершать (методы)
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("name-" + name + "; age=" + age);
        }
    }

    void sayHello() {
        System.out.println("Hello");

    }
    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
}