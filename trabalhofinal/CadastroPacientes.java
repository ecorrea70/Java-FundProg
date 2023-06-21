
/**
 * Escreva uma descrição da classe CadastroPacientes aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Arrays;
public class CadastroPacientes
{
    private Paciente [] vetor;
    private int i;
    
    public CadastroPacientes(int tamanho) {
        vetor = new Paciente[tamanho];
        i=0;
    }
    
    public boolean adicionarPaciente (Paciente a){
        if(i >= vetor.length){
            return false;
        } else {
            vetor[i] = a;
            i++;
            return true;
        } 
    }
    
    public void mostraPacientes(){
        for(int n=0; n<i; n++){
            System.out.println("\nCadastro de pacientes na posição" + (n+1)+ "\n********* ** ***** ** *******");            
            System.out.println(vetor[n].toString());
        }        
    }
    
    public void ordemAlfabetica(){
         Arrays.sort(vetor, 0, i, (paciente1, paciente2) -> paciente1.getNome().compareTo(paciente2.getNome()));
    }
    
}
