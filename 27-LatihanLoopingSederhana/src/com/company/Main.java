package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// program untuk menjumlahkan angka dengan rentang
        int nilaiAwal, nilaiAkhir,total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal: ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir: ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;
//
        while(nilaiAwal <= nilaiAkhir){
            total += nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
//
//        do{
//            total += nilaiAwal;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//            nilaiAwal++;
//        }while(nilaiAwal <= nilaiAkhir );

//        for(;nilaiAwal<=nilaiAkhir;nilaiAwal++){
//            total += nilaiAwal;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//        }
    }
}
