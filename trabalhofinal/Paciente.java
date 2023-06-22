
/**
 * Escreva uma descrição da classe Paciente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Paciente
{
    private String nome;
    private String cpf;
    private String telefone;
    private String convenio;
    private String diagnostico;
    private int numConsultas;
    
    
    public Paciente(String nome, String cpf, String telefone, String convenio, String diagnostico, int numConsultas) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.convenio = convenio;
        this.diagnostico = diagnostico;
        this.numConsultas = numConsultas;
    }
    
    public String getNome(){return nome;}
    public String getCpf(){return cpf;}
    public String getTelefone(){return telefone;}
    public String getConvenio(){return convenio;}
    public String getDiagnostico(){return diagnostico;}
    public int getNumconsultas(){return numConsultas;}

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setNumconsultas(int numConsultas) {
        this.numConsultas = numConsultas;
    }

    
    public String toString(){
        return "Nome: "+nome+"\nCPF: "+cpf+"\nTelefone: "+telefone+"\nConvênio: "+convenio+"\nDiagnóstico: "+diagnostico+"\nNúmero de consultas no mês: "+numConsultas;
    }
}
