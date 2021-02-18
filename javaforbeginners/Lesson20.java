package javaforbeginners;

public class Lesson20 {
    public static void main(String[] args) {
    HumanNew h1 = new HumanNew("Cory", 22);
    HumanNew h2 = new HumanNew("Alex", 32);
    HumanNew h3 = new HumanNew("Alex", 32);
    HumanNew h4 = new HumanNew("Alex", 32);
    h1.printCounter();

    }
}

class HumanNew {

        private String name;
        private int age;
        private static int countPeople = 0;


        public void setName(String name) {this.name = name;}
        public String getName() {return name;}
        public void setAge(int age) {this.age = age;}
        public int getAge() {return age;}





    public HumanNew(String name, int age) {
            this.name = name;
            this.age = age;
            countPeople++;
        //System.out.println("name: " + name + " " + "age: " + age);
    }

    public void printCounter () {
        System.out.println(countPeople);
    }
        }

