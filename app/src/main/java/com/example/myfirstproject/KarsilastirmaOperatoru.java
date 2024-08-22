package com.example.myfirstproject;

public class KarsilastirmaOperatoru {
    public static void main(String args[]) {

        int s1 = 50 ;
        int s2 = 40 ;
        System.out.println("1: " + (s1 == s2));

        int s3 = 45;
        int s4 = 45;
        Boolean kontrol = s3 == s4 ;
        System.out.println("2: " +kontrol);

        System.out.println("3: " + (s1 > s2));
        System.out.println("4: " + (s3 >= s4));

        System.out.println("5: " + (s1 != s2));
        System.out.println("6: " + (s3 != s4));

        int y1 = 70;
        int y2 = 80;

        System.out.println(s1 > s2 && y1 > y2); // && - AND : her iki şart da sağlanırsa true, yoksa false
        System.out.println(s1 > s2 && y1 <= y2);

        System.out.println(s1 < s2 || y1 > y2 ); // || - OR : ikisinden biri sağlanıyorsa true, hiç biri sağlanmıyorsa false

    }
}
