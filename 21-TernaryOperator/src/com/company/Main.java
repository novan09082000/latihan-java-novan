package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // ternary operator

        int input, x;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputUser.nextInt();

        // variabel x = ekspresi ? statemenet_true: statement false

        x = (input == 10) ? (input*input) : (input/2);

        // jika memakai if
//        if(input==10){
//            x = input * input
//        }else{
//            x = input/2;
//        }

        System.out.println("hasilnya " + x);
    }
}
