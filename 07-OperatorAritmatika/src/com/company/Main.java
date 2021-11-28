package com.company;

public class Main {

    public static void main(String[] args) {
	// Deklarasi Aritmatika
        int variabel1 = 10;
        int variabel2 = 5;
        int hasil;

    // 1. Penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);
    // 2. pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);
    // 3. perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n",variabel1,variabel2,hasil);
    // 4. pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);

        float a = 11;
        float b = 5;
        float hasilvariabel;
    // 4.a pembagian dengan koma menggunakan float
        hasilvariabel  = a / b ;
        System.out.printf("%f / %f = %f \n",a,b,hasilvariabel);

    // 5. modulus(sisa bagi)
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);
    }
}
