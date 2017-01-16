package runnable;

import br.acme.location.Lugar;
import br.acme.storage.*;
import java.util.Scanner;
import br.acme.users.*;
import java.util.Date;

public class User {

    static Scanner scan = new Scanner(System.in);
    static RepositorioSolicitante repoS = new RepositorioSolicitante();
    static RepositorioMotorista repoM = new RepositorioMotorista();

    public static void userType() {
        System.out.println("Bem vindo, usuário! Você é:\n"
                + "1 - Solicitante\n"
                + "2 - Motorista");
    }

    public static void userChoice() {
        System.out.println("Deseja:\n"
                + "1 - Login\n"
                + "2 - Cadastrar\n"
                + "0 - Sair");
    }

    public static void menuSolicitante() {
        System.out.println("O que deseja fazer:\n"
                + "1 - Solicitar carona\n"
                + "2 - Cancelar carona\n"
                + "3 - Ver histórico");
    }

    public static void menuMotorista() {
        System.out.println("O que deseja fazer:\n"
                + "1 - Responder pedido\n"
                + "2 - Ver histórico");
    }

    public static Solicitante cadastroSolicitante() {
        System.out.print("Nome: ");
        String nomeS = scan.next();
        System.out.print("CPF: ");
        String cpfS = scan.next();
        System.out.print("Email: ");
        String emailS = scan.next();
        System.out.print("Senha: ");
        String senhaS = scan.next();
        System.out.print("Sexo: ");
        String sexoS = scan.next();
        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        String data = scan.next();
        Date dataNascimentoS = new Date(data);
        System.out.print("Número de Celular: ");
        int nCelularS = scan.nextInt();
        Solicitante solicitante = new Solicitante(0, cpfS, nomeS, senhaS, emailS, sexoS, dataNascimentoS, nCelularS);
        return solicitante;
    }

    public static Motorista cadastroMotorista() {
        System.out.print("Nome: ");
        String nomeM = scan.next();
        System.out.print("CPF: ");
        String cpfM = scan.next();
        System.out.print("Email: ");
        String emailM = scan.next();
        System.out.print("Senha: ");
        String senhaM = scan.next();
        System.out.print("Sexo: ");
        String sexoM = scan.next();
        Motorista motorista = new Motorista(0, cpfM, nomeM, senhaM, emailM, sexoM);
        return motorista;
    }

    public static void main(String[] args) {
        OUTER:
        while (true) {
            userType();
            int userType = scan.nextInt();
            userChoice();
            int userChoice = scan.nextInt();
            switch (userType) {
                //SOLICITANTE
                case 1:
                    switch (userChoice) {
                        case 1:
                        // login
                        case 2:
                            Solicitante solicitante = cadastroSolicitante();
                            repoS.adicionar(solicitante);
                            menuSolicitante();
                            int menuSolicitante = scan.nextInt();
                            switch (menuSolicitante) {
                                case 1:
                                    System.out.println("Qual o endereço de origem?");
                                    String endOrigem = scan.nextLine();
                                    scan.nextLine();
                                    System.out.println("Qual o lugar? Ex: casa, trabalho.");
                                    String indOrigem = scan.nextLine();
                                    scan.nextLine();
                                    Lugar origem = new Lugar(indOrigem, endOrigem);
                                    System.out.println("Qual o endereço de destino?");
                                    scan.nextLine();
                                    String endDestino = scan.nextLine();
                                    scan.nextLine();
                                    System.out.println("Qual o lugar? Ex: casa, trabalho.");
                                    String indDestino = scan.nextLine();
                                    Lugar destino = new Lugar(indDestino, endDestino);
                                    System.out.println("Qual a forma de pagamento? Dinheiro, Cartão de Crédito/Débito");
                                    String formaDePagamento = scan.nextLine();
                                    scan.nextLine();
                                    solicitante.solicitarCarona(repoM, origem, destino, formaDePagamento);
                                    break;
                                case 2:
                                    //solicitante.cancelarCarona();
                                    break;
                                case 3:
                                    solicitante.historico();
                                    break;
                                default:
                                    System.out.println("Digite uma opção válida!");
                                    break;
                            }
                            break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("\nOpção inválida!\n");
                            break OUTER;
                    }
                // MOTORISTA
                case 2:
                    switch (userChoice) {
                        case 1:
                        // login
                        case 2:
                            Motorista motorista = cadastroMotorista();
                            repoM.adicionar(motorista);
                            menuMotorista();
                            int menuMotorista = scan.nextInt();
                            switch (menuMotorista) {
                                case 1:
                                    //motorista.responderPedidos(id, cliente, origem, destino, formaDePagamento);
                                    break;
                                case 2:
                                    motorista.historico();
                                    break;
                                default:
                                    System.out.println("Digite uma opção válida!");
                                    break;
                            }
                            break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("\nOpção inválida!\n");
                            break OUTER;
                    }
            }
        }
    }
}
