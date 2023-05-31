
/**
 * Escreva uma descrição da classe figura aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class gato
{
    public static void main(){
        //Criar todos os componentes
        Triangle tri1 = new Triangle(); //orelha
        Triangle tri2 = new Triangle(); //orelha
        Circle cir1 = new Circle(); //cabeça
        Circle cir2 = new Circle(); //olho
        Circle cir3 = new Circle(); //olho
        Circle cir4 = new Circle(); //preto do olho
        Circle cir5 = new Circle(); //preto do olho
        Triangle tri3 = new Triangle(); //nariz
        Triangle tri4 = new Triangle(); //bigode
        Triangle tri5 = new Triangle(); //boca
        
        //torna os objetos visíveis
        tri1.makeVisible();
        tri2.makeVisible();
        cir1.makeVisible();
        cir2.makeVisible();
        cir3.makeVisible();
        tri3.makeVisible();
        tri4.makeVisible();
        tri5.makeVisible();
        cir4.makeVisible();
        cir5.makeVisible();
        
        //mudar cor
        tri1.changeColor("yellow");
        tri2.changeColor("yellow");
        cir1.changeColor("yellow");
        cir2.changeColor("white");
        cir3.changeColor("white");
        cir4.changeColor("black");
        cir5.changeColor("black");
        tri3.changeColor("red");
        tri4.changeColor("black");
        tri5.changeColor("black");
        
        //mudança de local dos objetos
        tri2.moveHorizontal(30);
        tri2.moveVertical(30);
        tri1.moveVertical(30);
        tri2.moveHorizontal(9);
        tri1.moveHorizontal(9);
        
        cir2.moveVertical(23);
        cir3.moveVertical(23);
        cir2.moveHorizontal(34);
        cir3.moveHorizontal(60);
        cir4.moveVertical(23);
        cir5.moveVertical(23);
        cir4.moveHorizontal(34);
        cir5.moveHorizontal(60);
        
        tri3.moveVertical(90);
        tri3.moveHorizontal(27);
        
        tri4.moveVertical(98);
        tri4.moveHorizontal(25);
        
        tri5.moveVertical(110);
        tri5.moveHorizontal(25);
        
        //mudança de tamanho dos objetos
        cir1.changeSize(110);
        cir2.changeSize(18);
        cir3.changeSize(18);
        cir4.changeSize(9);
        cir5.changeSize(9);
        tri3.changeSize(10, 10);
        tri4.changeSize(3, 50);
        tri5.changeSize(2, 70);
    }
}
