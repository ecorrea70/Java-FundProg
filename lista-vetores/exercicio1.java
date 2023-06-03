/**
Exercício de contextualização: Crie um vetor de 20 elementos, do tipo double, com nome
numeros. Armazenar valores no vetor. Mostrar em tela: Quantos elementos o vetor possui,
os valores e seus respectivos índices.
 */
import java.util.Random;
public class exercicio1
{
    public static void main (String args[]){
        Random gerador = new Random();
        double numeros [] = new double[20];
        
        for(int i=0; i<20; i++){
            numeros[i]=gerador.nextDouble(11);
        }
        
        System.out.println("\fNúmero de elementos do vetor: "+numeros.length);
        for(int n=0; n<numeros.length; n++){
            System.out.println("Índice: "+n+", valor: "+numeros[n]);
        }
        
    }
}
