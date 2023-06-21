
/**
 * Escreva uma descrição da classe Aplicacao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aplicacao
{
    public static void main (String args[]){
    System.out.println("\n");
    CadastroPacientes cp = new CadastroPacientes (10);
    
    Paciente p1 = new Paciente ("Cláudio", "12345678910", "(51)994204100", "Particular", 5, 2);
    Paciente p2 = new Paciente ("Alan", "10987654321", "(11)997883197", "SUS", 5, 8);
    Paciente p3 = new Paciente ("Breno", "90986254321", "(21)987353197", "SUS", 5, 1);
    cp.adicionarPaciente(p1);
    cp.adicionarPaciente(p2);
    cp.adicionarPaciente(p3);
    
    cp.ordemAlfabetica();
    cp.mostraPacientes();
    
    
    
     
    }
    
    public static void menu(){
        System.out.println("Selecione uma opção: \n");
        System.out.println("1 - Sair\n");
        System.out.println("2 - Listar todos os pacientes\n");
        System.out.println("3 - Listar todos os pacientes em ordem alfabética\n");
        System.out.println("4 - Média das consultas dos pacientes\n");
    }
}
