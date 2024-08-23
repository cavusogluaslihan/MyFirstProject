package com.example.myfirstproject;

import java.util.Scanner;

public class TekCiftSayiBreakOrnek_AC {
    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        while (true){
            System.out.print("Sayı giriniz : ");

            int girilenSayi0 = tarayici.nextInt();
            if ((girilenSayi0%2)!=0){ // Çözümde burayı switch ile karşılaştırmış
                System.out.println("Sayı tek");
            } else {
                System.out.println("Sayı Çift");
            }

            System.out.println("Çıkış için (x), Devam için (1) tuşlayınız");

            String girilenKarakter = tarayici.next();

            if (girilenKarakter.equals("x")){
                System.out.println("Çıkış yapıldı");
                break;
            } else {
                System.out.println("Geçerli bir değer giriniz!");

                System.out.println("Çıkış için (x), Devam için (1) tuşlayınız");
            }

        }
    }
}



       /* while (true){
            System.out.println("Sayı giriniz: ");

            int girilenSayi0 = tarayici.nextInt();
            if ((girilenSayi0%2)!=0){
                System.out.println("Sayı tek");
            } else {
                System.out.println("Sayı Çift");
            }

            System.out.println("Çıkış için (1) Devam için diğer sayıları giriniz");

            int girilenSayi = tarayici.nextInt();

            if (girilenSayi == 1){
                System.out.println("Çıkış yapıldı");
                break;
            }

        }
    }
} */