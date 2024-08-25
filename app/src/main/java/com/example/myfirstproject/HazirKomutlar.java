package com.example.myfirstproject;

import java.util.Arrays;
import java.util.Random;

public class HazirKomutlar {
    public static void main(String args[]){

    int i = -5;
    System.out.println("Mutlak değer : " +Math.abs(i));
    System.out.println("Pi : " +Math.PI);
    System.out.println("Üs alma : " +Math.pow(2.0,3.0));
    System.out.println("Kök alma : " + Math.sqrt(9));

    // Rastgele sayı üretme

        Random r =  new Random();


        for (int k=0;k<5;k++){
            int sayi = r.nextInt(10); // 0-9 arasında bir dizi üretecek ve bunun içinden random bir sayı yazdıracak
            // for döngüsü ile döndürerek her seferinde farklı değer getirdiğini görebiliriz
            System.out.println(sayi);
        }

    }
}
