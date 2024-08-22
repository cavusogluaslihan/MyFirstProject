package com.example.myfirstproject;

import java.util.Scanner;

public class SwitchOrnekCalisma {
    public static void main(String args[]) {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Yapmak İstediğiniz Seçeneğin Numarasını Giriniz");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");


        Integer secim = tarayici.nextInt();



        switch (secim){
            case 1 :
                System.out.println("Birinci sayıyı giriniz");
                Integer sayi1 = tarayici.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                Integer sayi2 = tarayici.nextInt();
                System.out.println("Toplam : "+ (sayi1+sayi2));
                break;
            case 2 :
                System.out.println("Birinci sayıyı giriniz");
                Integer sayi3 = tarayici.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                Integer sayi4 = tarayici.nextInt();
                System.out.println("Fark : "+ (sayi3-sayi4));
                break;
            case 3 :
                System.out.println("Birinci sayıyı giriniz");
                Integer sayi5 = tarayici.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                Integer sayi6 = tarayici.nextInt();
                System.out.println("Çarpım : "+ (sayi5*sayi6));
                break;
            case 4 :
                System.out.println("Birinci sayıyı giriniz");
                Integer sayi7 = tarayici.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                Integer sayi8 = tarayici.nextInt();
                System.out.println("Bölüm : "+ (sayi7/sayi8));
                break;
            default:
                System.out.println("Lütfen geçerli bir tercih giriniz");
                break;
        }

    }
}

/* public class SwitchOrnekCalisma {
    public static void main(String args[]) {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Yapmak İstediğiniz Seçeneğin Numarasını Giriniz");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");


        Integer secim = tarayici.nextInt();

        System.out.println("Birinci sayıyı giriniz");
                Integer sayi1 = tarayici.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                Integer sayi2 = tarayici.nextInt();


        switch (secim){
            case 1 :
                System.out.println("Toplam : "+ (sayi1+sayi2));
                break;
            case 2 :
                System.out.println("Fark : "+ (sayi1-sayi2));
                break;
            case 3 :
                System.out.println("Çarpım : "+ (sayi1*sayi2));
                break;
            case 4 :
                System.out.println("Bölüm : "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("Lütfen geçerli bir tercih giriniz");
                break;
        }

    }
}
*/