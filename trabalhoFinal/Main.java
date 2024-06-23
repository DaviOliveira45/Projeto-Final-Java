import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Filial> filiais = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Carro> carros = new ArrayList<>();
    private static ArrayList<Aluguel> alugueis = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando algumas instâncias para teste
        inicializarDados();

        int opcao;
        do {
            exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    cadastrarCarro(scanner);
                    break;
                case 3:
                    listarCarrosDisponiveis();
                    break;
                case 4:
                    realizarAluguel(scanner);
                    break;
                case 5:
                    exibirRelatorioAlugueis();
                    break;
                case 6:
                    adicionarFilial(scanner);
                    break;
                case 7:
                    listarFiliais();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n### Sistema de Aluguel de Carros ###");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Cadastrar Carro");
        System.out.println("3. Listar Carros Disponíveis");
        System.out.println("4. Realizar Aluguel");
        System.out.println("5. Exibir Relatório de Aluguéis");
        System.out.println("6. Adicionar Filial");
        System.out.println("7. Listar Filiais");
        System.out.println("0. Sair do Programa");
        System.out.println("####################################");
    }

    private static void cadastrarCliente(Scanner scanner) {
        System.out.println("\n### Cadastro de Cliente ###");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, telefone, email);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarCarro(Scanner scanner) {
        System.out.println("\n### Cadastro de Carro ###");

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Quilometragem: ");
        double quilometragem = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Custo Diário de Aluguel: ");
        double custoDiario = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        Carro carro = new Carro(modelo, placa, ano, quilometragem, custoDiario);
        carros.add(carro);

        System.out.println("Carro cadastrado com sucesso!");
    }

    private static void listarCarrosDisponiveis() {
        System.out.println("\n### Carros Disponíveis ###");
        for (Carro carro : carros) {
            if (carro.isDisponivel()) {
                System.out.println(carro.getModelo() + " - Placa: " + carro.getPlaca());
            }
        }
    }

    private static void realizarAluguel(Scanner scanner) {
        System.out.println("\n### Realizar Aluguel ###");

        System.out.print("CPF do Cliente: ");
        String cpf = scanner.nextLine();

        Cliente cliente = buscarClientePorCPF(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        listarCarrosDisponiveis();

        System.out.print("Modelo do Carro a alugar: ");
        String modeloCarro = scanner.nextLine();

        Carro carro = buscarCarroPorModelo(modeloCarro);
        if (carro == null || !carro.isDisponivel()) {
            System.out.println("Carro não disponível para aluguel.");
            return;
        }

        System.out.print("Quantos dias deseja alugar? ");
        int dias = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Aluguel aluguel = new Aluguel(carro, cliente, dias);
        alugueis.add(aluguel);

        cliente.adicionarAluguel(aluguel);
        carro.setDisponibilidade(false);

        System.out.println("Aluguel realizado com sucesso!");
    }

    private static void exibirRelatorioAlugueis() {
        System.out.println("\n### Relatório de Aluguéis ###");
        for (Aluguel aluguel : alugueis) {
            System.out.println("Cliente: " + aluguel.getCliente().getNome() +
                               ", Carro: " + aluguel.getCarroAlugado().getModelo() +
                               ", Valor Total: " + aluguel.getValorTotal());
        }
    }

    private static void adicionarFilial(Scanner scanner) {
        System.out.println("\n### Adicionar Filial ###");

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Gerente: ");
        String gerente = scanner.nextLine();

        Filial filial = new Filial(endereco, gerente);
        filiais.add(filial);

        System.out.println("Filial adicionada com sucesso!");
    }

    private static void listarFiliais() {
        System.out.println("\n### Filiais Cadastradas ###");
        for (Filial filial : filiais) {
            System.out.println("Endereço: " + filial.getEndereco() + " - Gerente: " + filial.getGerente());
        }
    }

    private static Cliente buscarClientePorCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    private static Carro buscarCarroPorModelo(String modelo) {
        for (Carro carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modelo)) {
                return carro;
            }
        }
        return null;
    }

    private static void inicializarDados() {
        // Inicializando dados fictícios para testes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "(11) 9999-8888", "joao@email.com");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00", "(11) 7777-6666", "maria@email.com");
        clientes.add(cliente1);
        clientes.add(cliente2);

        Carro carro1 = new Carro("Fiat Uno", "ABC-1234", 2019, 20000.0, 50.0);
        Carro carro2 = new Carro("Chevrolet Onix", "XYZ-9876", 2020, 15000.0, 70.0);
        carros.add(carro1);
        carros.add(carro2);

        Filial filial1 = new Filial("Av. Paulista, 1000", "Fernando Souza");
        Filial filial2 = new Filial("R. Augusta, 500", "Juliana Lima");
        filiais.add(filial1);
        filiais.add(filial2);
    }
}
