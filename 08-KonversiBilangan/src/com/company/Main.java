package com.company;

public class Main {

    public static void main(String[] args) {
        // program konversi bilangan
        int nilaiInt = 20;
        System.out.println("nilai int = " + nilaiInt);

        // memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // memperluas rentang ke tipe data yang lebih kecil
        // karena tanpa casting byte, perintah akan error
        // casting biasanya tanda kurung () dan diisi dengan tipe data yang akan dikonversi
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);

        // CATATAN : di saat mengkonversi data mejadi tipe data yang lebih kecil, usahakan nilai tidak melebih nilai max atau niali min

        System.out.println("nilai max byte = " +  Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // Casting pembagian
        // cara konversi pembagian
        // 1. ubah variabel hasil dan setidaknya salah satu dari pembilang menjadi tipe data yang dikonfersikan
        float a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f",a,b,c);

        // 2. atau dengan cara casting salah satu pembilang pada saat pembagian
        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f",x,y,z);

    }
}
