package classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel Braga da Silva
 */
public class Pessoa {
    private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String imprimirPessoa() {
                String resp = "<b>Nome</b> = " + this.nome + "   |   <b>Idade</b> = " + this.idade + "<br><br>";
		return(resp);
	}

	public int getIdade() {
		return this.idade;
	}

	public String getNome() {
		return this.nome;
	}
}
