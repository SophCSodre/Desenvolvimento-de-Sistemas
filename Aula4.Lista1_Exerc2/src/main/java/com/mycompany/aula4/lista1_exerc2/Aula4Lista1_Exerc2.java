

package com.mycompany.aula4.lista1_exerc2;

import java.util.Scanner;


public class Aula4Lista1_Exerc2 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
     
        double v1 = 0.0;
        double v2 = 0.0;
        
        System.out.println("Digite um valor:");
        v1 = grava.nextDouble();
        
        v2 = v1*0.10;
        
        System.out.println("10% de " + v1 + " é: " + v2);
    }
}
