
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
    
    
    //método baseado no programa de cadastro de gatos que foi mostrado na aula
    public void mostraPacientes(){
        for(int n=0; n<i; n++){
            System.out.println("\n\n\nCadastro de pacientes na posição " + (n)+ "\n********* ** ***** ** *******");            
            System.out.println(vetor[n].toString());
        }        
    }
    
    //esse método ordena os pacientes pela ordem alfabética do nome de cada um
    public void ordemAlfabetica(){
         Arrays.sort(vetor, 0, i, (paciente1, paciente2) -> paciente1.getNome().compareTo(paciente2.getNome()));
    }
    
    //calcula a média do número de consultas dos pacientes
    public double mediaConsultas(){
        double media=0;
        media = (vetor[0].getNumconsultas()+vetor[1].getNumconsultas()+vetor[2].getNumconsultas()+vetor[3].getNumconsultas()+vetor[4].getNumconsultas()+vetor[5].getNumconsultas()+vetor[6].getNumconsultas()+vetor[7].getNumconsultas()+vetor[8].getNumconsultas()+vetor[9].getNumconsultas())/10;
        return media;
    }
    
    
    
    //métodos para alterar os dados de um paciente
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
    
    public void mudarNumconsultas(int index, int novoNumconsultas){
        if (index >= 0 && index < vetor.length) {
            vetor[index].setNumconsultas(novoNumconsultas);
            System.out.println("Número de consultas do paciente no mês alterado com sucesso.");
        } else {
            System.out.println("Índice inválido. Verifique o valor informado.");
        }
    }
    
    
    //calcular o valor total a ser pago no mês por um paciente
    public int calcularValormensal(int index, int valorConsulta){
        if (index >= 0 && index < vetor.length) {
            int valormensal = vetor[index].getNumconsultas()*valorConsulta;
            return valormensal;   
        } else {
            System.out.println("Índice inválido. Verifique o valor informado.");
            return 0;
        }
    }
    
    //aqui ele pega todas as doenças e exibe na tela as porcentagens de cada diagnóstico
    public void porcentagemDoencas(){
        int tamanho = i; 
        int covid = 0;
        int dengue = 0;
        int influenza = 0;
        int meningite = 0;
        int outro = 0;
    
        for (int j = 0; j < tamanho; j++) {
            String diagnostico = vetor[j].getDiagnostico();
        
            if (diagnostico.equalsIgnoreCase("covid")) {
                covid++;
            } else if (diagnostico.equalsIgnoreCase("dengue")) {
                dengue++;
            } else if (diagnostico.equalsIgnoreCase("influenza")) {
                influenza++;
            } else if (diagnostico.equalsIgnoreCase("meningite")) {
                meningite++;
            } else {
                outro++;
            }
        }
    
        double porcentagemCovid = (double) covid / tamanho * 100;
        double porcentagemDengue = (double) dengue / tamanho * 100;
        double porcentagemInfluenza = (double) influenza / tamanho * 100;
        double porcentagemMeningite = (double) meningite / tamanho * 100;
        double porcentagemOutro = (double) outro / tamanho * 100;
    
        System.out.println("\nCOVID: " + porcentagemCovid + "%");
        System.out.println("\nDengue: " + porcentagemDengue + "%");
        System.out.println("\nInfluenza: " + porcentagemInfluenza + "%");
        System.out.println("\nMeningite: " + porcentagemMeningite + "%");
        System.out.println("\nOutro diagnóstico: " + porcentagemOutro + "%");
    }

    //semelhante ao método anterior, mas com os convênios
    public void porcentagemConvenios(){
        int tamanho = i; 
        int sus = 0;
        int particular = 0;
        int plano = 0;
    
        for (int j = 0; j < tamanho; j++) {
            String convenio = vetor[j].getConvenio();
        
            if (convenio.equalsIgnoreCase("sus")) {
                sus++;
            }  
            if (convenio.equalsIgnoreCase("particular")) {
                particular++;
            }
            if (convenio.equalsIgnoreCase("plano")) {
                plano++;
            }
        }
    
        double porcentagemSUS = (double) sus / tamanho * 100;
        double porcentagemParticular = (double) particular / tamanho * 100;
        double porcentagemPlano = (double) plano / tamanho * 100;
    
        System.out.println("\nSUS: " + porcentagemSUS + "%");
        System.out.println("\nParticular: " + porcentagemParticular + "%");
        System.out.println("\nPlano: " + porcentagemPlano + "%");
    }    

}
