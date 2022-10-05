
package aula6.lista1_exerc1;

import java.util.Scanner;

public class Aula6Lista1_Exerc1 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int res = 0;
        int cpf, rg, cod;
        
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1- Inclusão");
        System.out.println("2- Alteração");
        System.out.println("3- Exclusão");
        System.out.println("4- Sair");
        
        res = grava.nextInt();
        
        switch(res){
            
            case 1:
                System.out.println("Digite seu RG");
                rg = grava.nextInt();
                System.out.println("Digite seu CPF");
                cpf = grava.nextInt();
                System.out.println("Digite seu Código");
                cod = grava.nextInt();
                break;
                
            case 2:
               System.out.println("Digite seu RG");
               rg = grava.nextInt();
               System.out.println("Digite seu CPF");
               cpf = grava.nextInt();
               System.out.println("Digite seu Código");
               cod = grava.nextInt();
               break;
               
            case 3:
                rg = 0;
                cpf = 0;
                cod = 0;
                System.out.println("Registros apagados");
                break;
                
            case 4:
                System.out.println("Saindo do sistema");
        }
    }
    
}