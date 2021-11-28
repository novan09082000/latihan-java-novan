package com.novan;

public class Main {
    public static void main(String[] args){
    //  tipe data di java
    //  integer, byte, short, long, double, float, char, boolean

    //  integer (bilangan bulat, jumlah nilai 2^32)
        int a = 1000000000;
        System.out.println("========INTEGER========");
        System.out.println("nilai integer = " + a);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar byte =  " + Integer.BYTES);
        System.out.println("Besar bit = " + Integer.SIZE);
    //  byte (bilangan bulat, jumlah nilai 2^8)
        byte b = 100;
        System.out.println("========BYTE========");
        System.out.println("nilai byte = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar byte =  " + Byte.BYTES);
        System.out.println("Besar bit = " + Byte.SIZE);
    //  short (bilangan bulat, jumlah nilai 2^16)
        short c = 10000;
        System.out.println("========SHORT========");
        System.out.println("nilai short = " + c);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar byte =  " + Short.BYTES);
        System.out.println("Besar bit = " + Short.SIZE);
    //  long (bilangan bulat, jumlah nilai 2^64)
        long d = 1000000000000000000L;
        System.out.println("========LONG========");
        System.out.println("nilai long = " + d);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar byte =  " + Long.BYTES);
        System.out.println("Besar bit = " + Long.SIZE);
    //  double (bilangan pecahan, jumlah nilai 2^64)
        double e = 10000000000.1d;
        System.out.println("========DOUBLE========");
        System.out.println("nilai double = " + e);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar byte =  " + Double.BYTES);
        System.out.println("Besar bit = " + Double.SIZE);
    //  float (bilangan pecahan, jumlah nilai 2^32)
        float f = 10000000.1f;
        System.out.println("========FLOAT========");
        System.out.println("nilai float = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar byte =  " + Float.BYTES);
        System.out.println("Besar bit = " + Float.SIZE);
    //  char (karakter, Berdasarkan ASCII)
        char g = 'g';
        System.out.println("========CHAR========");
        System.out.println("nilai char = " + g);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar byte =  " + Character.BYTES);
        System.out.println("Besar bit = " + Character.SIZE);
    //  boolean (bilangan logika true dan false)
        boolean h = true;
        System.out.println("========CHAR========");
        System.out.println("nilai boolean = " + h);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);
    }
}
