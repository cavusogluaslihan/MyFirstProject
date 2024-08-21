package com.example.myfirstproject;

public class StringBirlestirme {
    public static void main(String args[]) {

        String text1 = "Ali ";
        String sonuc = text1 + "merhaba. " ;
        String text3 = "Nasılsın?" ;
        String username = "Jammieblack12" ;
        String text2 = "Usurname : " + username ; // String birleştirme
        String sonuc2 = sonuc + text3 ;
        int lifetimePointOfUSer = 1080 ;

        String text4 = "User ("+username+") has "+lifetimePointOfUSer+" lifetime points" ;

            int number1 = 20;
            int number2 = 14;
            int total = number1 + number2 ;

        System.out.println(sonuc);
        System.out.println(text2);
        System.out.println(sonuc2);
        System.out.println(text4);

        System.out.println("Number1 : " +number1);
        System.out.println("Number2 : " +number2);
        System.out.println("Total : " +total); // total'i ayrı bir satırda toplatıp yazdırmak bir seçenek
        System.out.println("Total.v2 : " +(number1+number2)); // totali doğrudan print içinde yazdırmak da bir seçenek



    }
}
