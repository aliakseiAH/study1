package javaforbeginners;

import java.util.*;

public class Lesson33GenericsBasics {
    public static void main(String[] args) {

      /////////////////do genericov////////////
      List animals = new ArrayList();
      animals.add("cat");
      animals.add("dog");
      animals.add("frog");

      String animal = (String) animals.get(1);
        System.out.println(animal);
//////////////generics///////////////

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(1);
        System.out.println(animal2 );

        ///////////////java 7////////////

      List<String> animals3 = new ArrayList<>();




    }
}
