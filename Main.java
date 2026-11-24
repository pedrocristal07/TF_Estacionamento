import java.util.Scanner;

public class Main {
    private Cliente[] clientes;
    private Veiculo[] veiculos;
    private Vaga[][] estacionamento;
    private Ticket[] tickets;
    private Scanner entrada;

    public Main() {
        clientes = new Cliente[50];
        veiculos = new Veiculo[100];
        estacionamento = new Vaga[5][10];
        tickets = new Ticket[100];
        entrada = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        sistema.exibirMenu();
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n--- Estacionamento ---");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Cadastrar veículo");
            System.out.println("3. Consultar vagas");
            System.out.println("4. Registrar entrada");
            System.out.println("5. Registrar saída");
            System.out.println("6. Realizar pagamento");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine(); // consome o Enter que ficou no Scanner

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarVeiculo();
                    break;
                case 3:
                    consultarVagas();
                    break;
                case 4:
                    registrarEntrada();
                    break;
                case 5:
                    registrarSaida();
                    break;
                case 6:
                    realizarPagamento();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public void cadastrarCliente() {
    }

    public void cadastrarVeiculo() {
    }

    public void consultarVagas() {
    }

    public void registrarEntrada() {
    }

    public void registrarSaida() {
    }

    public void realizarPagamento() {
    }
}
