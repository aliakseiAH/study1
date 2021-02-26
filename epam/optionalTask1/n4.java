package epam.optionalTask1;

//Найти число, в котором количество различных цифр минимально.
// Если таких чисел несколько, найти первое из них.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String[] str = sc.nextLine().split(" ");
        List<char[]> charsList = new ArrayList<>();

        Character[] chars = new Character[str.length];
        for (int i = 0; i<chars.length; i++){
            charsList.add(str[i].toCharArray());
        }

        for (int i = 0; i< charsList.size(); i++) {
            System.out.println(Arrays.toString(charsList.get(i)));
        }


        for (int i = 0; i<charsList.size(); i++) {
            int count = 0;
            for (int j = 0; j<charsList.get(i).length-1; j++) {
                if (charsList.get(i)[j] == charsList.get(i)[j+1]) {
                    count++;
                }

            }
            System.out.println(count);
        }

    }
}

