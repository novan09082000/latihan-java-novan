package com.company;

public class Main {

    public static void main(String[] args) {

        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);

        float hasilFloat;

        hasilFloat = tambah(1,5.1f);
        printAngka(hasilFloat);

        hasilFloat = tambah(10.999f,15);
        printAngka(hasilFloat);

        hasilInteger = tambah(20,30,50);
        printAngka(hasilInteger);

        printAngka(7);
        printAngka(7.1d);
        printAngka(7.5f);
    }

    private static int tambah(int angkaInt1,int angkaInt2,int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static float tambah(float angkaFloat1,int angkaInt1){
        return angkaInt1 + angkaFloat1;
    }

    private static float tambah(int angkaInt1, float angkaFloat1){
        return angkaInt1 + angkaFloat1;
    }

    private static float tambah(float angkaFloat1, float angkaFloat2){
        return angkaFloat1 + angkaFloat2;
    }

    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(int angkaInteger){
        System.out.println("angka ini adalah integer denngan nilai = " + angkaInteger);
    }

    private static void printAngka(float angkaFloat){
        System.out.println("angka ini adalah Float denngan nilai = " + angkaFloat);
    }

    private static void printAngka(double angkaDouble){
        System.out.println("angka ini adalah double denngan nilai = " + angkaDouble);
    }
}
