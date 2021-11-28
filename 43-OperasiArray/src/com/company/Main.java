package com.company;

import java.util.Arrays;

public class Main {

//    cheat buat fungsi main (psvm)

    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
        // merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n=============");
        printArray(arrayAngka1);

        // mergkopi array
        System.out.println("\nMengkopi Array\n=============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("mengkopi dengan loop");
        for(int i=0;i < arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        System.out.println("mengkopi dengan copyOf");

        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("mengkopi dengan copyOf");

        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,3,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nfill array========\n");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\nkomparasi array========\n");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};

        System.out.println("\nmembandingkan antara yang lebih besar");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if(Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("array ini sama");
        }else {
            System.out.println("array ini beda");
        }

        System.out.println("\ncek mana array yang lebih besar");
    }

    public static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
