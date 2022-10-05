
package com.mycompany.aula4.lista1_exerc5;

import java.util.Scanner;

public class Aula4Lista1_Exerc5 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int a = 0;
        int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10 = 0;
        
        System.out.println("Digite a tabuada desejada:");
        a = grava.nextInt();
        
        b1 = a*1;
        b2 = a*2;
        b3 = a*3;
        b4 = a*4;
        b5 = a*5;
        b6 = a*6;
        b7 = a*7;
        b8 = a*8;
        b9 = a*9;
        b10 = a*10;
        
        System.out.println(a + " * 1 = " + b1);
        System.out.println(a + " * 2 = " + b2);
        System.out.println(a + " * 3 = " + b3);
        System.out.println(a + " * 4 = " + b4);
        System.out.println(a + " * 5 = " + b5);
        System.out.println(a + " * 6 = " + b6);
        System.out.println(a + " * 7 = " + b7);
        System.out.println(a + " * 8 = " + b8);
        System.out.println(a + " * 9 = " + b9);
        System.out.println(a + " * 10 = " + b10);
        
        
        
    }
}
