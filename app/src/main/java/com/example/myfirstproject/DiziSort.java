package com.example.myfirstproject;

import java.util.Arrays;

public class DiziSort {
    public static void main (String args[]) {

        String isimler[] = {"zeynep","mustafa","ahmet","vedat","ali"};

        System.out.println("Before Sort");
        for (String s:isimler) {
            System.out.println(s);
        }
            Arrays.sort(isimler); // buradan sonra tekrar yazdırdığımızda sor edilmiş olacak
        System.out.println("After Sort");
            for (String s2:isimler) {
                System.out.println(s2);
            }

        int rakamlar[] = {3,5,0,2,7,9,8,1,6,4}; //??? ters yönde sort nasıl yapacağım????

        System.out.println("Before Sort");
        for (int i: rakamlar) {
            System.out.println(i);
        }

        System.out.println("After Sort");
       Arrays.sort(rakamlar);
        for (int i2 : rakamlar) {
            System.out.println(i2);
        }


        System.out.println("After Ters Sort");
        for (int i3=rakamlar.length;i3>=0;i3--){
            System.out.println(i3);
        }

        }
    }

