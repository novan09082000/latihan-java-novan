package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // switch case
        // ekspresinya berupa satuan (int,long,byte,short), String atau enum;

        String input;

        Scanner inputUser = new Scanner(System.in);
        input = inputUser.next();

        System.out.print("panggil nama: ");
        System.out.println(input);

        switch(input){
            case "novan":
                System.out.println("benar, ini novan");
                break;
            case "tiano":
                System.out.println("benar, ini tiano");
                break;
            case "rossi":
                System.out.println("benar, ini rossi");
                break;
            default:
                System.out.println(input + " tidak ada");
        }

        System.out.println("selesai program");
    }
}
