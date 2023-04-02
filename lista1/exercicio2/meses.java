
/**
 * Escreva uma descrição da classe meses aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;

public class meses
{
   public static void main (String args[]){
       int idade;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("\fQual é a sua idade?");
       idade = entrada.nextInt();
       
       System.out.println("Você tem pelo menos "+(idade*12)+" meses de vida!");
       
   }
}
