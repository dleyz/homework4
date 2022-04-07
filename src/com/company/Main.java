package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int i = 0;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание 2
        int f = 1;
        for (; f <= 31; f = f + 7) {
            System.out.println("Segodnya pyatnica," + f + "-e chislo. Neobhodimo podgotovit'otchet.");

        }
        //Задание 3
        int b = 1822;
        while (b >= 1822 && b <= 2122) {
            b++ ;
            if (b % 79 == 0){
                System.out.println(b);
            }
        }
        //Задание 3
        int startYear = 1822;
        int endYear = 2122;
        for (int c = startYear; c <= endYear; c++) {
            if (c % 79 == 0) {
                System.out.println(c);
            }
        }



    }
}