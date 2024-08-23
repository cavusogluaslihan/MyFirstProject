package com.example.myfirstproject;

import java.util.Arrays;

public class Diziler {
    public static void main(String args []){

        //Boş bir diziye veri aktarımı

        int plakalar [] = new int[5]; // int [] plakalar  = new int[5]; --> [] değişkenden hemen sonra veya tanımdan sonra olabilir. İkisi de çalışır
        plakalar [0] = 34 ;
        plakalar [3] = 16 ;
        plakalar [2] = 65 ;

        System.out.println(Arrays.toString(plakalar)); // bu kodu dizinin içini görmek istersen kullanabilirsin

        // Dizilerden veri çekme

        String [] meyveler = {"elma", "muz", "vişne", "karpuz" , "portakal"}; // String [] meyveler =  new String[5] şeklinde dizi sayısını ayrı, dizi tanımlamalarını ayrı yazmadan doğrudan {} içine dizileri tanımlayabiliriz
        double [] oranlar = {1.2, 3.4, 2.5, 1.7};

        System.out.println(Arrays.toString(meyveler));
        System.out.println(Arrays.toString(oranlar));

                 // meyvelerden vişneyi yazdırmak istiyorum :

                    System.out.println(meyveler[2]);

                // oranlardan 1.7 yi yazdırmak istiyorum, farklı bir yöntem:

                    double istenenOran = oranlar[3];
                    System.out.println(istenenOran);

        // Değerlerin yerlerini değiştirme
                // karpuz -> mandalina yapalım

                System.out.println(Arrays.toString(meyveler));

                meyveler[3] = "mandalina";
                System.out.println(Arrays.toString(meyveler));

    }
}
