
package com.mycompany.aula4.lista2_exerc3;

import java.util.Scanner;

public class Aula4Lista2_Exerc3 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        String nome = "";
        System.out.println("Digite um nome: ");
        nome = grava.next();
        
        int a = 0;
        System.out.println("Digite um valor: ");
        a = grava.nextInt();

        System.out.println("Seu nome é: " + nome + "\n O valor desejado é: " + a);
    }
}
