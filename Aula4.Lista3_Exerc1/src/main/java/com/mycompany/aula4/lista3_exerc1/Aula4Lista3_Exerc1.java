
package com.mycompany.aula4.lista3_exerc1;

import java.util.Scanner;

public class Aula4Lista3_Exerc1 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);

        String nome = "";
        System.out.println("Digite seu nome:");
        nome = grava.next();
        
        double peso, alt, imc, imc2;
        System.out.println("Digite peso:");
        peso = grava.nextDouble();

        System.out.println("Digite altura:");
        alt = grava.nextDouble();
        
        imc = alt * alt;
        imc2 = peso/imc;
        
        System.out.println("Seu IMC é:" + imc2);
    }
}
