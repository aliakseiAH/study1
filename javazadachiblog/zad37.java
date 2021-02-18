package javazadachiblog;

//Итак, в переменную n должно записываться случайное (на время тестирования программы)
// целое число из [0;28800], далее оно должно выводиться на экран (для Петрова) и на следующей строке
// (для сотрудниц) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

public class zad37 {
    public static void main(String[] args) {
        double n = 28800 - Math.round(Math.random()*28800);
        int x = (int)(n/3600);
        System.out.println("Ostalos` " + n + " sec!" + " Ostalos` " + x + " ch");
    }
}
