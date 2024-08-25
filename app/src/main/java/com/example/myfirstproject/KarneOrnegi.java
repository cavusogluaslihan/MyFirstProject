package com.example.myfirstproject;

import java.util.Scanner;

public class KarneOrnegi {
    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        String dersAdıDizi[] = new String[3];
        int dersNotuDizi[] = new int[3];

        for (int i=0;i< dersAdıDizi.length;i++) {
            System.out.println((i+1)+ ". dersin adını giriniz");
            String girilenDersAdi = tarayici.next();
            dersAdıDizi[i] = girilenDersAdi;

            System.out.println((i+1)+". dersin notunu giriniz");
            int girilenDersNotu = tarayici.nextInt();
            dersNotuDizi[i] = girilenDersNotu;
        }

        int toplam = 0;

        for (int k=0;k< dersNotuDizi.length;k++){
        System.out.println(dersAdıDizi[k] + " : " + dersNotuDizi[k]);
        toplam = toplam + dersNotuDizi[k];
    }
        int ortalama = (toplam/ dersAdıDizi.length);
        System.out.println("ortalama : " + ortalama);

        if (ortalama>=50){
            System.out.println("Tebrikler! Sınıfı geçtiniz");
        } else {
            System.out.println("Üzgünüz, sınıfta kaldınız!");
        }
}
}


/* bu da çalışıyor ama bu çok manuel bir işlem. Dizi çok büyükse uygulanamaz
        System.out.println(dersAdıDizi[0] + " : " + dersNotuDizi[0]);
        System.out.println(dersAdıDizi[1] + " : " + dersNotuDizi[1]);
        System.out.println(dersAdıDizi[2] + " : " + dersNotuDizi[2]);
        System.out.println("ortalama : " + ((dersNotuDizi[0]+dersNotuDizi[1]+dersNotuDizi[2])/3));





*/