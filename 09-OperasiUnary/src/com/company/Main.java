package com.company;

public class Main {

    public static void main(String[] args) {
	// unary = operasi yang dilakukan pada satu variabel
        int angka = 1;

        // unary + dan -
        System.out.printf("unary '-', %d menjadi %d \n",angka,-angka);
        System.out.printf("unary '-', %d menjadi %d \n",angka,+angka);

        // unary decreament dan increamnet
        int angka2 =10;
        angka2++;//increament
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;//decreament
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n",b++);
        System.out.printf("nilai hasil dari postfix menjadi = %d \n",b);

        // unary boolean dengan ! untuk negasi

        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);


    }
}
