package com.example.myfirstproject;

import java.util.Scanner;

public class DongulerVeriİslemeTekrarOrnegi {
    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);
        System.out.print("İşlenecek veri miktarını giriniz : ");

        Integer veriMiktari = tarayici.nextInt();

        int n = veriMiktari; // n = 5 ise 5 4 3 2 1
        while (n>0){
            System.out.println("veri : " + (n));
            n--;
        }

    }
}
