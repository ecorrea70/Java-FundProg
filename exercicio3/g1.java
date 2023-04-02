
/**
 * Escreva uma descrição da classe g1 aqui. G1 = (P1 + 2*P2 + T1 + 2*T2)/6
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;

public class g1
{
    public static void main(String args[]){
        double p1, p2, t1, t2, notafinal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\fDigite a nota da P1: ");
        p1=entrada.nextDouble();
        
        System.out.println("Digite a nota da P2: ");
        p2=entrada.nextDouble();
        
        System.out.println("Digite a nota do T1: ");
        t1=entrada.nextDouble();
        
        System.out.println("Digite a nota da T2: ");
        t2=entrada.nextDouble();
        
        notafinal = (p1+(2*p2)+t1+(2*t2))/6;
        
        System.out.println("\fA nota final é: "+notafinal);
    }
}
