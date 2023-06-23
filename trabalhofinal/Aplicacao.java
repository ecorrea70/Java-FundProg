
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
    
        Paciente p1 = new Paciente("Cláudio", "12345678910", "(51)994204100", "Particular", "Covid", 2);
        Paciente p2 = new Paciente("Alan", "10987654321", "(11)997883197", "SUS", "Dengue", 8);
        Paciente p3 = new Paciente("Breno", "90986254321", "(21)987353197", "Plano", "Influenza", 1);
        Paciente p4 = new Paciente("Diana", "98765432101", "(51)9988776655", "Particular", "Covid", 3);
        Paciente p5 = new Paciente("Pedro", "87654321098", "(11)987654321", "SUS", "Dengue", 5);
        Paciente p6 = new Paciente("Maria", "76543210986", "(21)999888777", "Particular", "Influenza", 2);
        Paciente p7 = new Paciente("Luiza", "65432109876", "(31)987776655", "Plano", "Meningite", 4);
        Paciente p8 = new Paciente("Rafaela", "54321098765", "(41)988887777", "SUS", "Labirintite", 1);
        Paciente p9 = new Paciente("Anderson", "43210987654", "(15)999988887", "Particular", "Colesterol", 3);
        Paciente p10 = new Paciente("Juliana", "32109876543", "(48)997776655", "SUS", "Asma", 2);

        cp.adicionarPaciente(p1);
        cp.adicionarPaciente(p2);
        cp.adicionarPaciente(p3);
        cp.adicionarPaciente(p4);
        cp.adicionarPaciente(p5);
        cp.adicionarPaciente(p6);
        cp.adicionarPaciente(p7);
        cp.adicionarPaciente(p8);
        cp.adicionarPaciente(p9);
        cp.adicionarPaciente(p10);
    
        while (opcao != 0) {
            System.out.println("\n\nDigite uma opção: ");
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
            
                case 7:
                    cp.mostraPacientes();
                    System.out.println("Digite a posição do paciente que você deseja alterar o número de consultas no mês: ");
                    int index4 = Integer.parseInt(entrada.nextLine());
                    System.out.println("Digite o novo número de consultas: ");
                    int novoNumconsultas = Integer.parseInt(entrada.nextLine());
                    cp.mudarNumconsultas(index4, novoNumconsultas);
                    break;
            
                case 8:
                    cp.mostraPacientes();
                    System.out.println("Digite a posição do paciente que você deseja ver o valor a ser pago no mês: ");
                    int index5 = Integer.parseInt(entrada.nextLine());
                    System.out.println("Digite o valor das consultas: ");
                    int valorConsulta = Integer.parseInt(entrada.nextLine());
                    System.out.println("O valor total a ser pago no mês é: R$"+cp.calcularValormensal(index5, valorConsulta));
                    break; 
           
                case 9:
                    cp.porcentagemDoencas();
                    break;
            
                case 10:
                    cp.porcentagemConvenios();
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
            System.out.println("7 - Alterar o número de consultas de um paciente no mês\n");
            System.out.println("8 - Visualizar o valor mensal a ser pago por cada paciente\n");
            System.out.println("9 - Mostrar a porcentagem de pacientes com cada diagnóstico\n");
            System.out.println("10 - Mostrar a porcentagem de pacientes com cada convênio\n");
        }
}
