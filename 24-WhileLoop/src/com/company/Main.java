package com.company;

public class Main {

    public static void main(String[] args) {
//	    while(konidis){
//            aksi
//        }
        int a = 0;
        boolean kondisi = true;
        System.out.println("awal program");

        while(kondisi){
            System.out.println("white loop ke-" + a);
            if(a == 10) {
                kondisi = false;
            }
            a++;
        }

        System.out.println("akhir dari program");
    }
}
