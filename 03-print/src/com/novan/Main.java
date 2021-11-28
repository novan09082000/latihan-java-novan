package com.novan;

public class Main {
    public static void main(String[] args){
        // ini adalah perintah untuk mencetak hasil keluaran ke command
        // dalam bahasa java setidaknya ada tiga perintah yaitu print,println dan printf

        // println = println adalah kepanjangan dari print line, perintah ini akan mencetak hasil dalam bentuk satu baris
        //           yang artinya jika ada output command selanjutanya, dari java akan otomatis di enter ke baris selanjutnya
        System.out.println("Ini adalah baris pertama");
        System.out.println("ini adalah baris kedua");

        // print = sama seperti println, namun untuk lanjut ke baris berikut nya perlu menggunakan escape sequence "\n" atau newline
        System.out.print("ini adalah baris ketiga");
        System.out.print("ini adalah baris keempat");

        System.out.print("ini adalah baris kelima");
        System.out.println("ini adalah baris keenam");

        System.out.print("ini adalah baris ketujuh\n");
        System.out.print("ini adalah baris kedelapan\n");
        System.out.print("ini adalah baris kesembilan\n");

        // printf = printf atau print format merupakan perintah cetak dimana bisa mencetak apapun nilai dari tipe data dalam satu perintah
        System.out.printf("ini adalah baris ke-%d",10);
    }
}
