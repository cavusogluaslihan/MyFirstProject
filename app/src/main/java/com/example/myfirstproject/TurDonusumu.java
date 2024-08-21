package com.example.myfirstproject;

public class TurDonusumu {
    public static void main(String args[]) {

        //SAYISAL DÖNÜŞÜMLER
        // double —> float —> long —>  int —> short —> byte (DARALAN)
        // kendinden küçük bir türe dönüşüyorsa () içinde yeni türü belirtmemiz lazım

        double d = 23.56 ;
        long l = (long) d ;
        int i = (int) l ;

        System.out.println("Double Değer : " +d);
        System.out.println("Long Değer : " +l);
        System.out.println("Integer Değer : " +i);


        //byte —> short —> int —> long —> float —> double (GENİŞLEYEN)
        // kendinden büyük bir türe dönüşüyorsa belirtmemize gerek yok

        int x = 67 ;
        long y = x ;
        double z = y ;

        System.out.println("Integer Değer : " +x);
        System.out.println("Long Değer : " +y);
        System.out.println("Double Değer : " +z);

//-----------------------------------------------------
        // SAYISAL - STRING DÖNÜŞÜMLER
        // Sayısal to String

        int sayi = 56 ;
        String yazi1 = String.valueOf(sayi) ; // Önerilen method, performans anlamında daha iyi
        String yazi2 = Integer.toString(sayi) ;
        String yazi3 = sayi + "" ; // illegal bi yöntem


        System.out.println("1. Yöntemle Dönüşüm : " +yazi1);
        System.out.println("2. Yöntemle Dönüşüm : " +yazi2);
        System.out.println("3. Yöntemle Dönüşüm : " +yazi3);


        // String to Sayısal

        String metin = "78" ; // sayısala dönüşecek metinin gerçekten sayısal bir değer içermesi lazım içerisinde metin/harf vb bulunursa hata alır
        int sayi1 = Integer.parseInt(metin) ; // Önerilir
        int sayi2 = Integer.valueOf(metin);

        System.out.println("1. Yöntemle Dönüşüm : " +sayi1);
        System.out.println("2. Yöntemle Dönüşüm : " +sayi2);


    }
}
