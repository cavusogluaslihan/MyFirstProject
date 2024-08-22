package com.example.myfirstproject;

import android.media.MediaSyncEvent;

import java.util.Scanner;

public class DongulerIsimTekrarOrnegi {
public static void main(String args []) {

    Scanner tarayici = new Scanner(System.in);

    System.out.print("İsminizi giriniz : ");
    String isim = tarayici.next();

    System.out.print("Tekrarlama miktarını giriniz : ");
    Integer tekrarSayisi = tarayici.nextInt(); // n =6 ise 0,1,2,3,4,5

    for (int n = 0; n<tekrarSayisi; n++){
        System.out.println(isim + " - " + (n+1));
    }
}
}
