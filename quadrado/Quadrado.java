
/**
 * Escreva uma descrição da classe Quadrado aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Quadrado
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int lado;
    private int area;

    /**
     * Construtor para objetos da classe Quadrado
     */
    public Quadrado()
    {
        // inicializa variáveis de instância
        lado = 0;
        area=0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    
    public void setLado(int novoLado)
    {
        lado= novoLado;
    }
    
    public int getLado(){
        return lado;
    }
    
    public int getArea(){
        return area;
    }
    
    
    public void calculaArea(int l)
    {
        area = lado*lado;
    }
}
