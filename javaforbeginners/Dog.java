package javaforbeginners;

public class Dog extends Animal{
    public void bark() {
        System.out.println("Im barking");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void showName() {
        System.out.println(name);
    }

}
