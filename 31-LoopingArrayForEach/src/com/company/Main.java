package com.company;
import  java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	    int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(arrayAngka));

        // looping standar
        System.out.println("looping standar");
        for(int i=0; i < 10; i++){
            System.out.println("indeks ke-" + i + " adalah " + arrayAngka[i]);
        }


        // looping property array
        System.out.println("looping dengan properti length");
        for(int i=0; i<arrayAngka.length; i++){
            System.out.println("indeks ke-" + i + " adalah " + arrayAngka[i]);
        }

        // looping dengan for each
        System.out.println("looping for each");
        for(int angka : arrayAngka){
            System.out.println("angka pada looping ini = "+ angka);
        }
    }
}
