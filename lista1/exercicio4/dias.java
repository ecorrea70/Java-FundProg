
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
        String nome;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\fQual é seu nome? ");
        nome = entrada.nextLine();
        
        System.out.println("Qual é a sua idade? ");
        idade = entrada.nextInt();
        
        System.out.println(nome+", você já viveu pelo menos: "+(idade*365)+" dias!");
        
        
    }
}
