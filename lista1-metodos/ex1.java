import java.util.Scanner;

public class ex1
{
    public static void main (String args[]){
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("\fDigite o número de notas a serem lidas: ");
    int numnotas = entrada.nextInt();
    
    double notas = leitor(numnotas);
    double media = media(notas, numnotas);
    
    System.out.println("A média das notas digitadas é: "+media);
       
    }
    
    public static double leitor(int contador){
    double n=0;
    int cont=0;
    
    Scanner entrada = new Scanner (System.in);

    do {
      System.out.println("Digite a nota do aluno: ");
      n += entrada.nextDouble();
      cont++;
    }while(cont<contador);
    
    return n;
    }
    
    public static double media(double valores, int numerovalores){
    double m=0;
    
    m = valores/numerovalores;
    
    return m;
    }
}
