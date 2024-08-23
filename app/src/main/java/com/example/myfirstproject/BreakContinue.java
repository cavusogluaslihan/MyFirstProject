package com.example.myfirstproject;

public class BreakContinue {
    public static void main(String args[]){

        // 0-5 -> 6kez dönecek BREAK
        // İstenen değeri gördüğü anda keser o yüzden de System.out.printten sonra yazılır. Önce duracağı değeri görmesi gerekir

        for (int n = 0; n<6; n++){
            System.out.println("index (n) : "+ n);
            if (n ==3){
                break;
            }

        }

        // 0-5 -> 6kez dönecek CONTINUE
        // istenen değeri gördüğünde o değeri yazmayı atlar ve tekrar döngüye devam eder. O nedenle print continue den sonra gelir.

        for (int m = 0; m<6; m++){
            if (m ==2){
                continue;
            }
            System.out.println("index (m) : "+ m);
    }
}
}

