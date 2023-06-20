
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
    private int diagnostico;
    private int numConsultas;
    
    
    public Paciente(String nome, String cpf, String telefone, String convenio, int diagnostico, int numConsultas) {
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
    public int getDiagnostico(){return diagnostico;}
    public int getNumconsultas(){return numConsultas;}

    
    public void setNome(){String nome;}
    public void setCpf(){String cpf;}
    public void setTelefone(){String telefone;}
    public void setConvenio(){String convenio;}
    public void setDiagnostico(){int diagnostico;}
    public void setNumconsultas(){int numConsultas;}
    
    public String toString(){
        return "Nome: "+nome+"\nCPF: "+cpf+"\nTelefone: "+telefone+"\nConvênio: "+convenio+"\nDiagnóstico: "+diagnostico+"\nNúmero de consultas no mês: "+numConsultas;
    }
}
