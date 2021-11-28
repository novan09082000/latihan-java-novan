package com.company;

public class Main {

    public static void main(String[] args) {
	// Operator Bitwise --> operator untuk melakukan operasi pada byte
        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;



        // Operator SHIFT LEFT
        System.out.println("=====SHIFTLEFT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte)(a<<3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);

        // Operator SHIFT RIGHT
        System.out.println("=====SHIFTRIGHT");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte)(a>>1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);

        // Operator bitwise OR
        System.out.println("=====BITWISEOR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("---------------OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits,c);

        // Operator bitwise AND
        System.out.println("=====BITWISEAND");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("---------------AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits,c);

        // Operator bitwise XOR
        System.out.println("=====BITWISEXOR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("---------------XOR");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits,c);

        // Operator bitwise Negasi / Not
        System.out.println("=====BITWISE Not (~)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte) ~a;
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n",b_bits,b);
    }
}
