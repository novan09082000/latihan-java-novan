package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        int panjang,lebar,tinggi,volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userinput.nextInt();
        System.out.print("lebar = ");
        lebar = userinput.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas = " +luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userinput.nextInt();
        volume = luas * tinggi;
        System.out.println("volume = " + volume);
    }
}
