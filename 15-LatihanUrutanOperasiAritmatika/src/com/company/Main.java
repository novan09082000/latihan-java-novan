package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // kesimpulan adalah
        // perkalian atau pembagian akan dilakukan terlebih dahulu

        // jika dilakukan perkalian dan pembagian. maka
        // akan dilakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 / 2 ;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan ()
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        System.out.println("PERHITUNGANPERSAMAANKUADRAT");
        // perhitungan persamaan kuadrat
        int m,x,c;
        System.out.printf("nilai x = ");
        x = userInput.nextInt();
        System.out.printf("gradien m = ");
        m = userInput.nextInt();
        System.out.printf("bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("nilai y = " + y);
    }
}
