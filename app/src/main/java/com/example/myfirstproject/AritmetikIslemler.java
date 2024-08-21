package com.example.myfirstproject;

public class AritmetikIslemler {
    public static void main(String args[]) {

        // ORNEK1: daire alan: pi*r2
        double daireAlani;
        double pi = 3.14 ;
        int yaricap = 2 ;

        daireAlani = pi * yaricap * yaricap ;
        System.out.println("Daire Alanı : " +daireAlani);

        // ORNEK2: F = m*a (Uygulanan Kuvvet(F) = Kütle(m) * İvme(a)
        int kuvvet ;
        int kutle = 67 ;
        int ivme = 10 ;

        kuvvet = kutle * ivme ;
        System.out.println("Uygulanan Kuvvet : " +kuvvet);
        // System.out.println("Uygulanan Kuvvet : " +(kutle*ivme)); //kuvvet değişkeni ayrıca tanımlanmadıysa bu şekilde de yapılabilir


        // ORNEK3: x=((v1+v2)/2) * t ORNEK4: y=(v2 * t) + (a * t2)/2
        int x ;
        int y ;
        int v1 = 12 ;
        int v2 = 4 ;
        int t = 8 ;
        int a = 4;

        //ORNEK3
        x = ((v1+v2)/2) * t ;
        System.out.println("X : " +x);

        //ORNEK4
        y = (v2 * t) + (a * t * t) / 2 ;
        System.out.println("Y : " +y);

//--------------------------------------
        int toplam = 80 ;
       // toplam = toplam + 20 ; // bu şekilde yazabilirsin
        toplam += 20 ; //eğer kendini tekrar ediyorsa bunu kullanabilirsin // (değere kendi ile işlem yapıp yeni değer oluşturacaksan)
        System.out.println(toplam);

        int carpim = 200 ;
        carpim *= 2 ;
        System.out.println(carpim);
//-----------------------------------------
        int sayi1 = 4 ; // sayi1 = 4
        int sayi2 = ++sayi1 ; // sayi1 = 5 , sayi2 = 5
        int sayi3 = ++sayi1 ; // sayi1 = 6 , sayi3 = 6

        System.out.println("Sayı 1 = " +sayi1);
        System.out.println("Sayı 2 = " +sayi2);
        System.out.println("Sayı 3 = " +sayi3);

        int sayi4 = 4 ; // sayi4 = 4
        int sayi5 = ++sayi4 ; // sayi4 = 5 , sayi5 = 5
        int sayi6 = --sayi4 ; // sayi4 = 4 , sayi6 = 4

        System.out.println("Sayı 4 = " +sayi4);
        System.out.println("Sayı 5 = " +sayi5);
        System.out.println("Sayı 6 = " +sayi6);

        int k = 10 ; // k = 10
        int l = k++ ; // l = 10 , k = 11
        int m = k++ ; // m = 11 , k = 12

        System.out.println("k değeri = " + k);
        System.out.println("l değeri = " + l);
        System.out.println("m değeri = " + m);

        int p = 10 ; // p = 10
        int r = p++ ; // r = 10 , p = 11
        int s = p-- ; // s = 11 , p = 10

        System.out.println("p değeri = " + p);
        System.out.println("r değeri = " + r);
        System.out.println("s değeri = " + s);

    }
}
