
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente {

    private int numero, pin;
    private double saldo;
    private Conta titular;
    private String telefone;
    String[] historico;
    int contador = 0;
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente() {
    }

    public Cliente(Conta titular, double saldo) {
        this.numero = numero;
        this.pin = pin;
        this.saldo = saldo;
        this.titular = titular;
        pin = 1000 + (new Random().nextInt(9000));
        numero = 10000 + (new Random().nextInt(90000));

        this.saldo = saldo;

    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            if (contador < 1000)
                historico[contador++] = "Depositou R$ " + valor;
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            if (contador < 1000)
                historico[contador++] = "Sacou R$ " + valor;
        }
    }

    public double consultaSaldo() {
        return saldo;
    }

    public int validaPin(int userPin) {
        System.out.println("Escreva seu Pin");
        Scanner sc = new Scanner(System.in);
        userPin = sc.nextInt();
        if (pin != userPin) {
            System.out.println("Pin Invalido");
            System.exit(0);
            ;
        }
        return pin;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getTitular() {
        return titular.getNome();
    }

    public int getNumero() {
        return numero;
    };

    public boolean equals(Cliente clientes) {
        return (this.numero == clientes.numero);
    }

    public void extrato() {
        System.out.println("\n\n\tExtrato");
        System.out.println("Numero da conta:" + this.numero);
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("O pin atual é: " + this.pin);
        System.out.println("O teu número é: " + this.telefone);
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public void excluirCliente(Cliente c) {
        clientes.remove(c);
    }
}
