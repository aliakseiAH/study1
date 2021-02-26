package javaforbeginners.lesson35AnonimousClasses;

public class Test2 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Anonimous eating");
            }
        };
        ableToEat.eat();

    }
}

interface AbleToEat {
    public void eat();
}


