/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula4.lista2_exerc1;

import java.util.Scanner;

/**
 *
 * @author sophia
 */
public class Aula4Lista2_Exerc1 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double a=0, b=0, c=0, res=0;
        
        System.out.println("Digite 3 valores:");
        a = grava.nextDouble();
        b = grava.nextDouble();
        c = grava.nextDouble();
        
        res = a + b + c * 10 / 2;
        
        System.out.println("O resultado é: " + res);
    }
}
