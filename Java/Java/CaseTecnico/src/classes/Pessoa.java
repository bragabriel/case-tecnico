package classes;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void imprimirPessoa() {
		System.out.println("Nome = " + this.nome);
		System.out.println("Idade = " + this.idade + "\n");
	}

	public int getIdade() {
		return this.idade;
	}

	public String getNome() {
		return this.nome;
	}
}
