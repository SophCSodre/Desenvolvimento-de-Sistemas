
package aula6.lista2_exerc2;

import java.util.Scanner;

public class Aula6Lista2_Exerc2 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double vt, vr, ir, sal2;
        
        double sal = 0.0;
        System.out.println("Digite seu salário:");
        sal = grava.nextDouble();
        
        vt = sal * 0.02;
        vr = sal * 0.06;
        ir = sal * 0.07;
        sal2 = sal - (vt + vr + ir);
        
        if (sal2 >= 1200){
            sal2 = sal2 - (ir * 0.15);
            System.out.println("Seu salário é de: " + sal2);
        } else {
            System.out.println("Não houve desconto.");
        }
        
    }
    
}