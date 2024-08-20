package com.example.myfirstproject;

public class DegiskenOlusturma {
    public static void main(String args[]) {

// Integers
// byte - 8bit (-128 to +127)
// short - 16bit (-32768 to 32767)
// int - 32bit (-2 147 483 648 to 2 147 483 647)
// long - 64bit (çok daha büyük değerler)

// Characters
// char - 16bit, unicode

// Floating Point Numbers
// float - 4bytes (-3.4 x 1038 to 3.4 x 1038)
// double - 8bytes (-1.7 x 10308 to 1.7 x 10308)

// Boolean
// True / False

// Double > Float > Long > Integer > Short > Byte

//Class name'ler upper case olmalı

        String userName = "Aslihan" ;
        int userAge = 30 ;
        float userLength = 1.70f ;
        double userWeight = 56.7 ;
        char userNameFirstCharacter = 'A' ;

        System.out.println(userName);
        System.out.println(userAge);
        System.out.println(userLength);
        System.out.println(userWeight);
        System.out.println(userNameFirstCharacter);


        int urunID = 3416 ;
        String urunAdi = "Kol Saati" ;
        int urunAdet = 100 ;
        float urunFiyat = 149.99f ;
        String urunTedarikci = "Rolex" ;

        System.out.println(urunAdi);
        System.out.println(urunID);
        System.out.println(urunFiyat);
        System.out.println(urunAdet);
        System.out.println(urunTedarikci);


    }
}
