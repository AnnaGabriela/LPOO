package runnable;

import br.acme.storage.RepositorioMotorista;
import br.acme.storage.RepositorioSolicitante;
import br.acme.users.Gerente;
import br.acme.users.Motorista;
import java.util.Scanner;

public class Manager {

    static RepositorioMotorista repo = new RepositorioMotorista();
    static RepositorioSolicitante repoS = new RepositorioSolicitante();
    static Scanner scan = new Scanner(System.in);

    public static Gerente cadastroGerente() {
        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("CPF: ");
        String cpf = scan.next();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Senha: ");
        String senha = scan.next();
        System.out.print("Sexo: ");
        String sexo = scan.next();
        Gerente gerente = new Gerente(0, cpf, nome, senha, email, sexo);
        return gerente;
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
        System.out.println("Bem vindo, gerente!");
        Gerente gerente = cadastroGerente();
        while (true) {
            System.out.println("O que deseja fazer, "+gerente.getNome()+"?\n"
                    + "1 - Cadastrar motorista\n"
                    + "2 - Remover motorista\n"
                    + "3 - Listar motorista\n"
                    + "4 - Listar clientes\n"
                    + "0 - Sair");
            int inicio = scan.nextInt();
            switch (inicio) {
                case 1:
                    Motorista motorista = cadastroMotorista();
                    gerente.cadastrarMotorista(motorista, repo);
                    break;
                case 2:
                    gerente.listarMotoristas(repo);
                    System.out.println("Digite o iD do motorista a ser removido:");
                    long idRemover = scan.nextLong();
                    gerente.removerMotorista(idRemover, repo);
                    break;
                case 3:
                    gerente.listarMotoristas(repo);
                    break;
                case 4:
                    gerente.listarClientes(repoS);
                    break;
                case 0: 
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
