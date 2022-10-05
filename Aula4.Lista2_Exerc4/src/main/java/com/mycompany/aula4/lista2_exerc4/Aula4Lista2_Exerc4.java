

package com.mycompany.aula4.lista2_exerc4;

import java.util.Scanner;

public class Aula4Lista2_Exerc4 {

    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        
        double a, b, dis, qtnd;
        
        System.out.println("Digite o tempo percorrido: ");
        a = grava.nextDouble();
        
        System.out.println("Digite a velocidade: ");
        b = grava.nextDouble();
        
        dis = a * b;
        qtnd = dis / 12;
        
        System.out.println("Foi gasto " + qtnd + " litros em sua viagem");
    }
}
