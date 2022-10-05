

package com.mycompany.aula4.lista1_exerc4;

import java.util.Scanner;

public class Aula4Lista1_Exerc4 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double a = 0;
        double b = 0;
        double c1 = 0;
        double c2 = 0;
        double c3 = 0;
        double c4 = 0;
        
        System.out.println("Digite dois valores:");
        a = grava.nextDouble();
        b = grava.nextDouble();
        
        c1 = a + b;
        c2 = a - b;
        c3 = a * b;
        c4 = a / b;
        
        System.out.println(a + " + " + b + " = " + c1);
        System.out.println(a + " - " + b + " = " + c2);
        System.out.println(a + " * " + b + " = " + c3);
        System.out.println(a + " / " + b + " = " + c4);
        
        
    }
}
