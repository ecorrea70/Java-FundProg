
import java.util.Scanner;
import java.lang.Math;

public class Exercicio2
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        final double g = 6.67426 * Math.pow((1/10), Math.abs(-11));
        final double m = 5.97 * Math.pow(10, 24);
        final double r = 6371 * 1000;
        double t = 45 * 60;
        double h = (Math.pow(((g * m * Math.pow(t,2)) / (4 * Math.pow(Math.PI,2))),(1.0/3)))-r;
        
        System.out.println("\fA altitude é: "+h);
    }
    
}