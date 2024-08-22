package com.example.myfirstproject;


import static kotlin.jvm.internal.Reflection.typeOf;

import java.util.Scanner;

public class IfOrnekCalisma {
    public static void main(String args []) {

        Scanner tarayici = new Scanner(System.in);
        System.out.println("Seçim Yapınız");
        System.out.println("(1) Çember Alanı");
        System.out.println("(2) Dikdörtgen Alanı");
        double pi = 3.14 ;

        String secim = tarayici.next();

       if(secim.equals("1")){
           System.out.println("Çember yarıçapını giriniz");
            int yaricap = tarayici.nextInt();
            System.out.println("Çember alan : " +(pi * yaricap * yaricap));
        } else if (secim.equals("2")) {
           System.out.println("Kısa kenar giriniz");
           int kisaKenar = tarayici.nextInt();
           System.out.println("Uzun kenar giriniz");
           int uzunKenar = tarayici.nextInt();
           System.out.println("Dikdörtgen Alanı : " + (kisaKenar * uzunKenar));
       } else {
           System.out.println("Lütfen geçerli bir değer giriniz!");
       }
    }
}
