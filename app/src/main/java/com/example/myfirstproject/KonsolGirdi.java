package com.example.myfirstproject;

import java.util.Scanner;

public class KonsolGirdi {
    public static void main(String args[]) {

        Scanner tarayici = new Scanner(System.in) ;

        System.out.print("Lütfen adınızı giriniz : ");
        String gelenIsim = tarayici.next() ;  // tam bu kısımda konsola bir değer girilip enter'a basılmayı bekliyor. Değer girildikten sonra o değeri çekip değişkene aktaracak, sonra o değişken yazdırılacak.


        System.out.print("Lütfen soy adınızı giriniz : ");
        String gelenSoyisim = tarayici.next() ;


        System.out.print("Lütfen yaşınızı giriniz : ");
        int gelenYas = tarayici.nextInt() ;


        System.out.print("Lütfen boyunuzu giriniz : ");
        double gelenBoy = tarayici.nextDouble();


        System.out.print("Evli misiniz? ");
        boolean evliMi = tarayici.nextBoolean() ;


        System.out.println("Ad : " +gelenIsim);
        System.out.println("Soyad : " +gelenSoyisim);
        System.out.println("Yaş : " +gelenYas);
        System.out.println("Boy : " +gelenBoy);
        System.out.println("Evli mi : " +evliMi);



    }
}
