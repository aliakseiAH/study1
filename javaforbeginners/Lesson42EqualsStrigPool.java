package javaforbeginners;

public class Lesson42EqualsStrigPool {
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1(1);
        Animal1 animal12 = new Animal1(2);

        System.out.println(animal12==animal1);
        System.out.println(animal12.equals(animal1));
    }
}

class Animal1{
    private int id;


    public Animal1 (int id) {
        this.id = id;
    }

    public boolean equals (Animal1 animal1) {

        return this.id == animal1.id;
    }
}