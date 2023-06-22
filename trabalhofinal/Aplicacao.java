
/**
 * Escreva uma descrição da classe Aplicacao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Aplicacao
{
    public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);
    int opcao = 100;
        
        
    System.out.println("\f");
    CadastroPacientes cp = new CadastroPacientes (10);
    
    Paciente p1 = new Paciente ("Cláudio", "12345678910", "(51)994204100", "Particular", "Covid", 2);
    Paciente p2 = new Paciente ("Alan", "10987654321", "(11)997883197", "SUS", "Dengue", 8);
    Paciente p3 = new Paciente ("Breno", "90986254321", "(21)987353197", "SUS", "Influenza", 1);
    cp.adicionarPaciente(p1);
    cp.adicionarPaciente(p2);
    cp.adicionarPaciente(p3);
    
    //cp.ordemAlfabetica();
    //cp.mostraPacientes();
    
    while (opcao != 0) {
    System.out.println("Digite uma opção: ");
    menu();
    opcao = Integer.parseInt(entrada.nextLine());

    switch (opcao) {
        case 0:
            break;
        
        case 1:
            cp.mostraPacientes();
            break;

        case 2:
            cp.ordemAlfabetica();
            cp.mostraPacientes();
            break;

        case 3:
            System.out.println("A média de consulta dos pacientes é de: " + cp.mediaConsultas() + " consultas por mês!");
            break;

        case 4:
            cp.mostraPacientes();
            System.out.println("Digite a posição do paciente que você deseja alterar o telefone: ");
            int index = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite o novo número: ");
            String novoTelefone = entrada.nextLine();
            cp.mudarTelefone(index, novoTelefone);
            break;
        
        case 5:
            cp.mostraPacientes();
            System.out.println("Digite a posição do paciente que você deseja alterar o connvênio: ");
            int index2 = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite o novo convênio: ");
            String novoConvenio = entrada.nextLine();
            cp.mudarConvenio(index2, novoConvenio);
            break;
            
        case 6:
            cp.mostraPacientes();
            System.out.println("Digite a posição do paciente que você deseja alterar o diagnóstico: ");
            int index3 = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite o novo diagnśotico: ");
            String novoDiagnostico = entrada.nextLine();
            cp.mudarDiagnostico(index3, novoDiagnostico);
            break;
            
        default:
            System.out.println("Opção inválida!!!");
            break;
    }
}

    System.out.println("Encerrando a aplicação...");
    
    
     
    }
    
    public static void menu(){
        System.out.println("0 - Sair\n");
        System.out.println("1 - Listar todos os pacientes\n");
        System.out.println("2 - Ordenar os pacientes em ordem alfabética\n");
        System.out.println("3 - Média das consultas dos pacientes\n");
        System.out.println("4 - Alterar o telefone de algum paciente\n");
        System.out.println("5 - Alterar o convênio de algum paciente\n");
        System.out.println("6 - Alterar o diagnóstico de algum paciente\n");
    }
}
