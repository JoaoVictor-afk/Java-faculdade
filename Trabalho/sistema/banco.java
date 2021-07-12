import java.util.Random;

import java.util.ArrayList;

public class banco {
    private String nome;
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static int numContas;

    public banco() {

    }

    public void cadastrarUmaConta(Cliente Conta) {
        clientes.add(Conta);
        numContas++;
    }
}