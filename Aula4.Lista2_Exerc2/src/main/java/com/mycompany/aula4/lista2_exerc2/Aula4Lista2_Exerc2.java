
package com.mycompany.aula4.lista2_exerc2;

import java.util.Scanner;

public class Aula4Lista2_Exerc2 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double a, val1, val2, val3, val4;
        
        System.out.println("Digite um valor em reais: ");
        a = grava.nextDouble();
        
        val1 = 0.06 * a;
        val2 = a - val1;
        val3 = val2 + 10;
        val4 = val3 / 4;
        
        System.out.println("O resultado é: " + val4);
    }
}
