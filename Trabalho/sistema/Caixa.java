
import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {
    Cliente cliente = new Cliente();
    Scanner entrada = new Scanner(System.in);
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void iniciar() {
        int opcao;
        do {
            exibirMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        } while (opcao != 5);
    }

    public void exibirMenu() {
        System.out.println("\t Escolha a opção desejada: ");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Emprestimo");
        System.out.println("5 - Sair\n");

    }

    public void escolheOpcao(int opcao) {

        int i = 0;
        double valor;
        switch (opcao) {
            case 1:
                cliente.extrato();

                break;
            case 2:

                if (i++ <= 3) {

                    System.out.println("Quanto deseja Depositar: ");
                    valor = entrada.nextDouble();
                    this.cliente.depositar(valor);
                }
                break;
            case 3:
                System.out.println("Quanto deseja sacar: ");
                valor = entrada.nextDouble();
                this.cliente.sacar(valor);
                break;
            case 4:
                System.out.println("Sistema encerrado.");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }

}
