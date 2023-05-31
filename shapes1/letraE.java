
/**
 * Escreva uma descrição da classe figura aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class letraE
{
    public static void main(){
        //Criar todos os componentes
        Square quad1 = new Square();
        Square quad2 = new Square();
        Square quad3 = new Square();
        Square quad4 = new Square();
        Square quad5 = new Square();
        Square quad6 = new Square();
        Square quad7 = new Square();
        Square quad8 = new Square();
        Square quad9 = new Square();
        Square quad10 = new Square();
        
        //Deixar todos blocos visíveis
        quad1.makeVisible(); 
        quad2.makeVisible();
        quad3.makeVisible();
        quad4.makeVisible();
        quad5.makeVisible();
        quad6.makeVisible();
        quad7.makeVisible();
        quad8.makeVisible();
        quad9.makeVisible();
        quad10.makeVisible();
        
        //Mudar cor dos quadrados para azul
        quad1.changeColor("blue");
        quad2.changeColor("blue");
        quad3.changeColor("blue");
        quad4.changeColor("blue");
        quad5.changeColor("blue");
        quad6.changeColor("blue");
        quad7.changeColor("blue");
        quad8.changeColor("blue");
        quad9.changeColor("blue");
        quad10.changeColor("blue");
        
        
        //Linha 1
        quad6.moveHorizontal(30);
        quad7.moveHorizontal(60);
        
        //Linha 2
        quad2.moveVertical(30);
        
        //Linha 3
        quad3.moveVertical(60);
        quad8.moveVertical(60);
        quad8.moveHorizontal(30);
        
        //Linha 4
        quad4.moveVertical(90);
        
        
        //Linha 5
        quad5.moveVertical(120);
        quad9.moveVertical(120);
        quad9.moveHorizontal(30);
        quad10.moveVertical(120);
        quad10.moveHorizontal(60);
        
    }
}
