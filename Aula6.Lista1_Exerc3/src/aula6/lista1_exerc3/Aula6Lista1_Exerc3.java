
package aula6.lista1_exerc3;

import java.util.Scanner;

public class Aula6Lista1_Exerc3 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int a = 0;
        System.out.println("Digite sua idade:");
        a = grava.nextInt();
        
        if (a <= 0){
            System.out.println("Idade inválida");
        } else if (a <= 10){
            System.out.println("Infatil");
        } else if (a <= 13){
            System.out.println("Infanto-Juvenil");
        } else if (a <= 17){
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
    
}
