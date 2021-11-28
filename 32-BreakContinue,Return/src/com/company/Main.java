package com.company;

public class Main {

    public static void main(String[] args) {
        //break,continue, dan return
        int a = 0;
        boolean kondisi = true;
        while(kondisi){
            a++;
            if( a == 10){
                break; // ini adalah keyword untuk keluar dari loop
            }else if(a==5){
                continue; // ini adalah keyword untuk memaksa memulai aksi dari awal
            }else if (a==7){
                return; // mengakhiri method main
            }
            System.out.println("looping ke-" + a);
        }
        System.out.println("akhir dari looping");
    }
}
