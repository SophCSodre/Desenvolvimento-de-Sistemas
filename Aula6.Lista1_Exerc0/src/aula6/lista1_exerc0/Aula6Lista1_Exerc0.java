
package aula6.lista1_exerc0;

import java.util.Scanner;

public class Aula6Lista1_Exerc0 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
       
        String nome = "";
        System.out.println("Digite seu nome");
        nome = grava.next();
        
        double peso, alt, imc;
        System.out.println("Digite peso");
        peso = grava.nextDouble();

        System.out.println("Digite altura");
        alt = grava.nextDouble();
        
        imc = peso/ (alt * alt);
        
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobre peso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade leve");
        } else if (imc < 38.9) {
            System.out.println("Obesidade moderada");
        } else {
        System.out.println("Obesidade morbida");
        }
    }
    
}
