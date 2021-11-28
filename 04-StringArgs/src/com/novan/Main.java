package com.novan;

public class Main {
    public static void main(String[] args){
        // paramater apa sih yang ada dalam fungsi main?
        // paramter tersebut terdapat tipe data String, array "[]", dan keywords args
        // arti dari paramter bahwa args adalah variabel bawaan java yang mana asal nilai ada di perintah setelah comand java exceute
        // setiap indeks args adalah tiap perkata comandnya dimulai dari kata pertama adalah args[0] dan jika ada kata berikutnya maka indeks selanjutnya dari args sebelumnya
        // contoh => input:   java com.novan.Main hai ganteng
        //           perintah java:  System.out.println(args[0] + "novan" args[1]);
        //           output:  hai novan ganteng
        System.out.println(args[0]);
        System.out.println("halo dunia");

        // cara untuk mengeksekusi nya tidak bisa menggunakan run dari IDE intellij, namun kita bisa gunakan terminal untuk mengeksekusinya
        // bedanya, cara mengeksekusinya ditambahakan dengan nilai args seperti yang sudah dijelaskan diatas
    }
}
