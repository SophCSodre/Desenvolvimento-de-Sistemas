
package aula11.lista2_exerc1;

import java.util.Scanner;

public class Aula11Lista2_Exerc1 {

    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    int op = 0;
        
    do {
        System.out.println("Lista de exercícios\n 1- Exercicio1 \n 2- Exercicio2  \n 3- Exercicio3 \n 4- Exercicio4 \n 5- Exercicio5 \n 6- Exercicio6 \n 7- Sair");

        op = grava.nextInt();
            
        if (op == 1){
            double p =50;
            double c =0;
            
            for(p = 1; p <= 20; p++){
             c = p*2.54;
            System.out.println(p +" polegadas é igual " + c + " centimetros.");
            }
        }else if (op == 2){
            double f =50;
            double c =0;
            
            for(f = 50; f <= 150; f++){
             c = 5*(f-32)/9;
            System.out.println(f +"°F Fahrenheit é igual " + c + "°C Celsius");
            }
                
        }else if (op == 3){
            String nome= "";
            int idade = 0, sexo=0, cont=0;
            for(cont = 0; cont <=2; cont++){
                System.out.println("Digite um nome :");
                nome = grava.next();
                System.out.println("Digite a idade :");
                idade = grava.nextInt();
                System.out.println("Selecione o Sexo: \n 1-Mulher / 2-Homem");
                sexo = grava.nextInt();
                if (idade >= 21 && sexo == 2){
                    System.out.println(nome);
                }
            }
        }else if (op == 4){
            int sexo = 0;
            int contm = 0;
     
            do{
                    
                System.out.println("Pesquisa informativa");
                System.out.println("1- Masculino \n 2- Feminino \n3-Não informado \n 0- Para Sair");
                sexo = grava.nextInt();
                if (sexo == 1){
                        contm++;
                }
            } while (sexo != 0);
                    
            System.out.println("A quantidade de pessoas do sexo masculino é" + contm);
                
        }else if (op == 5){
            double a = 5000, b=7000, porca=0, porcb=0;
            int anos = 0;
            while(a < b){
                a = a + (a*0.03);
                b = b + (b*0.02);
                anos ++;
            }
            System.out.println("Levou " + anos + " anos para A passar a B");
                
        }else if (op == 6){
            double maria = 1.10, joao=1.50;
            int anos = 0;
            while(maria < joao){
                maria = maria + (maria+0.03);
                joao = joao + (joao+0.02);
                anos ++;
            }
            System.out.println("Levou " + anos + " anos para Maria passar João");
    
        }else if (op == 7){
                
        }else {
            System.out.println("Opção inválida");
        }
    }while (op != 7);
    }
}

