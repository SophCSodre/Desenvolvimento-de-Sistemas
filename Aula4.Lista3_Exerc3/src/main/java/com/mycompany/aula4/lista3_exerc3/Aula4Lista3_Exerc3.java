
package com.mycompany.aula4.lista3_exerc3;

import java.util.Scanner;

public class Aula4Lista3_Exerc3 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int ida = 0;
        double dia = 0;
        double hr = 0;
        String nome = "";
        
        System.out.println("Digite seu nome: ");
        nome = grava.next();
        
        System.out.println("Digite sua idade: ");
        ida = grava.nextInt();
        
        dia = ida * 365;
        hr = dia * 24;
        
        System.out.println("Você viveu " + dia + " dias.");
        System.out.println("Você viveu " + hr + " horas.");
    }
}
