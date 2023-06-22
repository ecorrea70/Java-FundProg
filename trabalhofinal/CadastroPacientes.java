
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
            System.out.println("\nCadastro de pacientes na posição " + (n)+ "\n********* ** ***** ** *******");            
            System.out.println(vetor[n].toString());
        }        
    }
    
    public void ordemAlfabetica(){
         Arrays.sort(vetor, 0, i, (paciente1, paciente2) -> paciente1.getNome().compareTo(paciente2.getNome()));
    }
    
    public double mediaConsultas(){
        double media=0;
        media = (vetor[0].getNumconsultas()+vetor[1].getNumconsultas()+vetor[2].getNumconsultas())/3;
        return media;
    }
    
    public void mudarTelefone(int index, String novoTelefone){
        if (index >= 0 && index < vetor.length) {
            vetor[index].setTelefone(novoTelefone);
            System.out.println("Número de telefone do paciente alterado com sucesso.");
        } else {
            System.out.println("Índice inválido. Verifique o valor informado.");
        }
    }

    public void mudarConvenio(int index, String novoConvenio){
        if (index >= 0 && index < vetor.length) {
            vetor[index].setConvenio(novoConvenio);
            System.out.println("Convênio do paciente alterado com sucesso.");
        } else {
            System.out.println("Índice inválido. Verifique o valor informado.");
        }
    }
    
    public void mudarDiagnostico(int index, String novoDiagnostico){
        if (index >= 0 && index < vetor.length) {
            vetor[index].setDiagnostico(novoDiagnostico);
            System.out.println("Diagnśotico do paciente alterado com sucesso.");
        } else {
            System.out.println("Índice inválido. Verifique o valor informado.");
        }
    }
}
