package javaforbeginners;

import java.util.ArrayList;
import java.util.List;

public class AdvArrayListBasics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        System.out.println(arrayList);
//
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(99));
//
//        System.out.println(arrayList.size());
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        for (Integer x:list)
            System.out.println(x);

        list.remove(5);
        for (Integer x:list)
            System.out.println(x);

    }
}