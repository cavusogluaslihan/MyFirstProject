package com.example.myfirstproject;

public class DegiskenOlusturmaCesitleri {
    public static void main(String args[]) {

        boolean userIsPremium = false ;

        // Değer doğrudan tanımlanabilir
        int number = 67 ;
        // Değer önce tanımlanmayıp sonra atanabilir
        int number2 ;
        number2 = 45 ;
        // Aynı türde ise (,) ile ayırarak birden fazla yan yana yazılarak tanımlanabilir

        double number3 = 4.5 , number4 = 10.7 ;

        double number5,number6 ;
        number5 = 6.75 ;
        number6 = 21.5 ;

        System.out.println(userIsPremium);

        userIsPremium = true ;

        System.out.println(userIsPremium);

        int saleOfJanuary = 10456 ;
        int saleOfFebruary = 12794 ;
        int saleOfMarch = 11946 ;
        int totalOfFirstQuarter ;
        totalOfFirstQuarter = saleOfJanuary + saleOfFebruary + saleOfMarch ;

        System.out.println(totalOfFirstQuarter);

    }
}
