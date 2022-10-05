
package com.mycompany.aula4.lista3_exerc2;

import java.util.Scanner;

public class Aula4Lista3_Exerc2 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double km, temp, l;
        System.out.println("Digite quantos km foram percorridos: ");
        km = grava.nextDouble();
        
        System.out.println("Digite quanto tempo foi percorrido: ");
        temp = grava.nextDouble();
        
        l = km / temp;
        
        System.out.println("Resultado: " + l);
    }
}
