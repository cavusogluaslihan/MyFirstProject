package com.example.myfirstproject;

public class IfCalismasi {
    public static void main(String args[]) {

        int yas = 17;
        String isim = "Alican";

        if (yas > 18){
            System.out.println("Reşitsiniz");
        } else {
            System.out.println("Reşit değilsiniz");
        }

        if (isim.equals("Ahmet")) {
            System.out.println("Merhaba Ahmet");
        } else if (isim.equals("Ali")) {
            System.out.println("Merhaba Ali");
        } else {
            System.out.println("Merhaba yabancı :)");
        }

        int password = 1234;
        String username = "admin";

        if (password == 1234 && username.equals("admin") ) {
            System.out.println("Merhaba " + username);
        } else {
            System.out.println("Invalid username or password. Please try again!");
        }

        int ltv = 1001 ;
        boolean userIsPremium = false ;
        String countryOfUser = "NL" ;
        if (ltv > 1000 || userIsPremium == true || countryOfUser.equals("USA")) {
            System.out.println("Now, you have limitless texting!");
        } else {
            System.out.println("You only have 2 messages left!");
        }

    }
}