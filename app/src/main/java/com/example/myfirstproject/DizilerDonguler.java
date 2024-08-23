package com.example.myfirstproject;

public class DizilerDonguler {
    public static void main(String args []){
        {

            String sehirler [] = {"bursa", "izmir", "ankara", "van", "trabzon"} ;


        //burada tek tek elle yazdırdık
            System.out.println("elle yazdırma");
        System.out.println(sehirler[0]);
        System.out.println(sehirler[1]);
        System.out.println(sehirler[2]);
        System.out.println(sehirler[3]);
        System.out.println(sehirler[4]);


        //for döngüsü ile tek seferde yazdırdık
            System.out.println("for döngüsü ile yazdırma");
        for (int i=0;i<5;i++){
            System.out.println(sehirler[i]);
        }
        }

        // farz edelim ki çok uzun bir dizi var
        //Dizi boyutunu elle girmek yerine dinamik bir şekilde koda dahil edebilmek için
        //1 - ayrı bir değişken oluşturup onu kodda çağırmak "int boyut = ulkeler.length;"

       /* String ulkeler [] = {"US", "USA", "NL", "AR", "SP", "BR" ,"EG", "CA", "IE", "IN", "IT","MX"};
        int boyut = ulkeler.length;

        for (int i=0;i<boyut;i++){
            System.out.print(ulkeler[i] + " ");
        } */

        {
        //2 - ulkeler.length'i doğrudan çağırmak "for (int i=0;i< ulkeler2.length;i++){"

        String ulkeler2 [] = {"US", "USA", "NL", "AR", "SP", "BR" ,"EG", "CA", "IE", "IN", "IT","MX"};

            System.out.println("lenght çağırılarak yazdırma");
        for (int i=0;i< ulkeler2.length;i++){
            System.out.print(ulkeler2[i] + " ");
        }
        }

        {
        String markalar [] = {"apple", "google", "hp" }; // ??? neden MX ile hp birleşiyor ???

            System.out.println("tersten yazdırma");
        for (int n=2;n>=0;n--){
            System.out.println(markalar[n]);
        }

    }


    //3- For each yöntemi

    String isimler[] = {"ahmet", "ayşe","zeynep","murat"};
        System.out.println("for each yöntemi ile yazdırma");
        for (String s:isimler) {
            System.out.println(s);
        } 

        int rakamlar [] = {0,1,2,3,4,5,6,7,8,9};
        for (int r:rakamlar){
            System.out.println(r);
        }
}
}