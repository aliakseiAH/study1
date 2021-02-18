package javaforbeginners.interfaces;

public class Animal implements Info {
    public int id;

    public void sleep() {
        System.out.println("Im sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("id is " + this.id);
    }
}
