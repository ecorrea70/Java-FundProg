
/**
 * Escreva uma descrição da classe dias aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;

public class dias
{
    public static void main (String args[]){
        int idade;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\fQual é a sua idade? ");
        idade = entrada.nextInt();
        
        System.out.println("Você já viveu pelo menos: "+(idade*365)+" dias!");
        
        
    }
}
