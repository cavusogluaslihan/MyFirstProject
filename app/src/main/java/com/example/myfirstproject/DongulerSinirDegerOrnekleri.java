package com.example.myfirstproject;

public class DongulerSinirDegerOrnekleri {
    public static void main(String args[]) {

        // ORN1: 3 ile 6 arasında döngü 3 - 4 - 5 - 6

        for (int a=3; a<7; a++ ){
            System.out.println("a değeri : " +a);
        }

        int b = 3;
        while (b<7){
            System.out.println("b değeri : " +b);
            b++;
        }

        // ORN2: 0-8 çift sayılar

        for (int c = 0; c<10; c+=2){ // c+=2 --> c = c+2
            System.out.println("c değeri : " +c);
        }

        int d = 0;
        while(d<10){
            System.out.println("d değeri : " +d);
            d +=2;
        }

    }
}
