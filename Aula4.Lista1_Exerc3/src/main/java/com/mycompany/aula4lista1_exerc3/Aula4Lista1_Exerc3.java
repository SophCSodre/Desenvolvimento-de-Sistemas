
package com.mycompany.aula4lista1_exerc3;

import java.util.Scanner;

public class Aula4Lista1_Exerc3 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        String nome1 = "";
        String nome2 = "";
        String nome3 = "";
        
        System.out.println("Digite os nomes: ");
        nome1 = grava.next();
        nome2 = grava.next();
        nome3 = grava.next();
        
        System.out.println(nome1 + ", " + nome2 + ", " + nome3 + " são amigos desde a infância");
    }
}
