package com.example.myfirstproject;

import java.util.Scanner;

public class TekCiftSayiBreakOrnek_Answer {

        public static void main(String args[]){

            Scanner tarayici = new Scanner(System.in);

            while (true){
                System.out.println("Sayı giriniz: ");

                int girilenSayi0 = tarayici.nextInt();

                int sonuc = girilenSayi0 % 2;
                switch (sonuc){
                    case 0 :
                        System.out.println("Sayı Çift");
                        break;
                    case 1 :
                        System.out.println("Sayı tek");
                        break;
                }


                System.out.println("Çıkış için (1) Devam için diğer sayıları giriniz");
                int girilenSayi = tarayici.nextInt();

                if (girilenSayi == 1){
                    System.out.println("Çıkış yapıldı");
                    break;
                }

            }

            }
}




