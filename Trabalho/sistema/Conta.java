import java.util.ArrayList;

public class Conta {

	private String nome;
	private String bi;

	public Conta(String nome) {
		this.nome = nome;
	}

	public Conta(String nome, String bi) {
		this.nome = nome;
		this.bi = bi;

	}

	public String getNome() {
		return nome;
	}

	public String getBi() {
		return bi;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setBi(String bi) {
		this.bi = bi;
	}

}