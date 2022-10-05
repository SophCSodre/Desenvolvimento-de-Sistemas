
package aula6.lista1_exerc2;

import java.util.Scanner;

public class Aula6Lista1_Exerc2 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int res = 0;
        int val1 = 0;
        double val2 = 0.0;
        
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1- Veja a mensagem");
        System.out.println("2- 10% do valor desejado");
        System.out.println("3- Selecionar");
        System.out.println("4- Sair");
        
        res = grava.nextInt();
        
        switch(res){
            
            case 1:
                System.out.println("Olá! Está é a sua mensagem! =) ");
                break;
                
            case 2:
               System.out.println("Digite o valor desejado");
               val1 = grava.nextInt();
               val2 = val1*0.10;
               System.out.println("10% de " + val1 + " é: " + val2);
               break;
               
            case 3:
                System.out.println("Você selecionou a opção 3!");
                break;
                
            case 4:
                System.out.println("Saindo do sistema");
        }
    }
    
}
