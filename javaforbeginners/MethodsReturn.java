package javaforbeginners;

import java.sql.SQLOutput;

public class MethodsReturn {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Vasya");
        person1.setAge(23);
        person1.sayHello();
        System.out.println("Getter works: " + person1.getAge() + " " + person1.getName());



    }
}


class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        age = userAge;
    }

    public int getAge() {
        return age;
    }
    void sayHello() {
        System.out.println("Hello, i`m " + name +". I`m " + age + " years old");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
}