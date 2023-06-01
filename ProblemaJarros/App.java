
/**
 * Escreva a descri��o da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */
public class App
{
    public static void main(String args[]){
        Jarro j1 = new Jarro(4);
        Jarro j2 = new Jarro(3);
        
        
        j1.encher();
        j1.despejar(j2);
        j2.esvaziar();
        j1.despejar(j2);
        j1.encher();
        j1.despejar(j2);
        
        System.out.println("Estado do Jarro1: "  +j1.getLitros()+" litros");
    }
}
