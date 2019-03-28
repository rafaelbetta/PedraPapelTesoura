package pedraPapelTesoura;

import pedraPapelTesoura.Escolha;

public class Jogador {

//	variavel
	private Escolha escolha;
	private String nome;

//	objeto
	public Jogador(String nome, Escolha escolha) {
		this.escolha = escolha;
		this.nome = nome;
		
	}

	protected Jogador() {

	}

	// source generate getters and setters
	public String getNome() {
		return nome;
	}

	public Escolha getEscolha() {
		return escolha;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected void setEscolha(Escolha escolha) {
		this.escolha = escolha;
	}

}


