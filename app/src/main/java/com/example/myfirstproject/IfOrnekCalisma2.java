package com.example.myfirstproject;

import java.util.Scanner;

public class IfOrnekCalisma2 {
    public static void main(String args[]) {

        Scanner tarayici = new Scanner(System.in);
        System.out.println("Yapmak İstediğiniz Seçeneğin Numarasını Giriniz");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");

        String secim = tarayici.next();



        if (secim.equals("1")) {

            System.out.println("Birinci sayıyı giriniz");
            double sayi1 = tarayici.nextDouble();

            System.out.println("İkinci sayıyı giriniz");
            double sayi2 = tarayici.nextDouble();

            System.out.println("Toplam :" +(sayi1+sayi2));

        } else if (secim.equals("2")) {

            System.out.println("Birinci sayıyı giriniz");
            double sayi1 = tarayici.nextDouble();

            System.out.println("İkinci sayıyı giriniz");
            double sayi2 = tarayici.nextDouble();

            System.out.println("Fark :" +(sayi1-sayi2));

        } else if (secim.equals("3")) {

            System.out.println("Birinci sayıyı giriniz");
            double sayi1 = tarayici.nextDouble();

            System.out.println("İkinci sayıyı giriniz");
            double sayi2 = tarayici.nextDouble();

            System.out.println("Çarpım :" +(sayi1*sayi2));

        } else if (secim.equals("4")) {

            System.out.println("Birinci sayıyı giriniz");
            double sayi1 = tarayici.nextDouble();

            System.out.println("İkinci sayıyı giriniz");
            double sayi2 = tarayici.nextDouble();

            System.out.println("Bölüm :" +(sayi1/sayi2));

        } else {
            System.out.println("Lütfen geçerli bir değer giriniz");
        }

    }
}

