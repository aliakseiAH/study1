package javaforbeginners.Lesson32UpcastingDowncasting;

public class Test {
    public static void main(String[] args) {

//        //upcasting - восходящее преобразование
//        Dog dog = new Dog();
//        Animal animal = dog;
//
//
//
//        //downcasting
//        Dog dog2 = (Dog) animal;
//
//        dog2.bark();

        Animal a = new Animal();
        Dog dog =(Dog) a;

        dog.bark();

    }
}