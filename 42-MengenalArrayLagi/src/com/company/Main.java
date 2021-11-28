package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        // sifat ini bukan mengkopi nilai akan tetapi mengkopi alamat array
        arrayAngka2 = arrayAngka1;

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));
    }

    // method yang argumennya adalah reference, pass by reference
    // bukan pass by falue

    public static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
    }
}
