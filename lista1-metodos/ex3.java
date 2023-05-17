import java.util.Scanner;
public class ex3
{
    public static void main (String args[]){
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("\fDigite 3 valores: ");
    double valor1 = entrada.nextDouble();
    double valor2 = entrada.nextDouble();
    double valor3 = entrada.nextDouble();
    
    System.out.println("A média dos valores é: "+(media(valor1, valor2, valor3)));
    
    }
    
    public static double media(double v1, double v2, double v3){
    double m=0;
    
    m = (v1+v2+v3)/3;
    
    return m;
    }
}
