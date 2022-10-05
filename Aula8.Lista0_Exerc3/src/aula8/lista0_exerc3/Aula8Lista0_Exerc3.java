
package aula8.lista0_exerc3;

import java.util.Scanner;

public class Aula8Lista0_Exerc3 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double media = 0.0;
        int ida, num, quant=0;
        
        System.out.println("Digite a quantidade de alunos");
        num = grava.nextInt();
        quant = num;

        do{
            System.out.println("Digite a idade dos alunos");
            ida = grava.nextInt();
            media = media + ida;
            quant = quant - 1;


        }while(quant > 0);
        
        media = media/num;
        System.out.println("A média de idade dos alunos é de: " + media);
    }
    
}
