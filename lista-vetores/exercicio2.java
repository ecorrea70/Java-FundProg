
/**
Crie um vetor para 20 alturas em cm (use um vetor de inteiros): a) Preencha o vetor com
alturas aleatórias do intervalo [0; 200]; b) Escreva apenas as alturas pares; c) Escreva apenas
as alturas cujos indices são pares; d) Escreva apenas as alturas pares cujos indices são
impares; e) Escreva o vetor ao contrário; f) Escreva a média de altura; g) Escreva quantas
alturas estão acima da média; h) Escreva a menor altura e a sua posição.
 */
import java.util.Random;
public class exercicio2
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   public static void main (String args[]){
       Random gerador = new Random();
       
       int alturas[] = new int[20];
       int total=0;
       
       System.out.println("\f");
       
       //a
       for(int i=0; i<20; i++){
            alturas[i]=gerador.nextInt(200);
       }
       
       
       //b
       for(int i=0; i<20; i++){
           if(alturas[i]%2==0){
               System.out.println("Altura: "+alturas[i]+"cm   Índice: "+i);
           }
       }
       
       
       //c
       for(int i=0; i<20; i++){
           if(i%2==0){
               System.out.println("Altura: "+alturas[i]+"cm   Índice: "+i);
           }
       }
       
       
       //d
       for(int i=0; i<20; i++){
           if(alturas[i]%2==0 && i%2!=0){
               System.out.println("Altura: "+alturas[i]+"cm   Índice: "+i);
           }
       }
       
       
       //e
       for(int i=19; i>=0; i--){
           System.out.println("Altura: "+alturas[i]+"cm   Índice: "+i);
       }
       
       
       //f
       for(int i=0; i<20; i++){
           total = total+alturas[i];
       }
       double mediaAlturas = (total/alturas.length);
       System.out.println("A média das alturas é: "+mediaAlturas);
       
       
       //g
       int acimaMedia=0;
       for(int i=0; i<20; i++){
           if (alturas[i]>mediaAlturas){
               acimaMedia=acimaMedia+1;
           }
       }
       System.out.println("Alturas acima da média: "+acimaMedia);
       
       //h
       int menor=alturas[0];
       for(int i=0; i<20; i++){
           if (alturas[i] < menor) {
                menor = alturas[i];
            }
       }
       System.out.println("A menor altura é: "+menor+"cm");
   }
}
