package com.company;

public class Main {

    public static void main(String[] args) {

        // nested if atau if bercabang

        int a = 2;
        int b = 10;

        System.out.println("ini adalah awal dari program");

        if(a == 5){
           if(b == 10){
               System.out.println("ini adalah dimana a = 5 dan b = 10");
           } else{
               System.out.println("ini adalah dimana a =5 dan bukan 10");
           }
        }else{
            System.out.println("ini adalah dimana a salah");
        }
        System.out.println("ini adalah akhir dari program");
    }
}
