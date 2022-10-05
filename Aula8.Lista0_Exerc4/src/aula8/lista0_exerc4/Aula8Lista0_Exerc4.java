
package aula8.lista0_exerc4;

import java.util.Scanner;

public class Aula8Lista0_Exerc4 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int rec = 0;
        
        System.out.println("Digite quantas vezes você quer que a mensagem apareça");
        rec = grava.nextInt();
        
        do {
            rec--;
            System.out.println("Isso é um teste!");
        }while (rec > 0);
    }
    
}
