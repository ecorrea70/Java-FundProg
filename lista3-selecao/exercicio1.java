import java.util.Scanner;
public class exercicio1
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\fDigite uma nota entre 0 e 10: ");
        double nota = entrada.nextDouble();
        
        if (nota>=0 && nota<=10){
            if (nota<3){
                System.out.println("Nota E");
            }
            if (nota>=3 && nota<=4.9){
                System.out.println("Nota D");
            }
            if (nota>=5 && nota<=6.9){
                System.out.println("Nota C");
            }
            if (nota>=7 && nota<=8.9){
                System.out.println("Nota B");
            }
            if (nota>=9){
                System.out.println("Nota A");
            }
        }else{
            System.out.println("Nota Inválida!");
        }
        
        
    }
}
