

package com.mycompany.aula4.lista1_exerc1;

import java.util.Scanner;


public class Aula4Lista1_Exerc1 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        String nome = "";
        
        System.out.println("Digite o nome do aluno:");
        nome = grava.next();
        
        System.out.println("Digite as notas:");
        nota1 = grava.nextDouble();
        nota2 = grava.nextDouble();
        nota3 = grava.nextDouble();      
        
        double media1 = nota1 + nota2 + nota3;
        double media2 = media1/3;
       
        System.out.println("O Aluno " + nome + " teve a media de: \n" + media2);
    }
}
