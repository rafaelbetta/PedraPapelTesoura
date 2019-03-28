package pedraPapelTesoura;

import java.util.Random;

public class Computador extends Jogador {

	public Computador() {
		super();
		// TODO Auto-generated constructor stub
		String nome = this.gerarNome();
		Escolha escolha = this.escolher();
		
		this.setEscolha(escolha);
		this.setNome(nome);
	}

	protected String gerarNome() {
		return "Computador";
	}

	protected Escolha escolher() {
		Random gerador = new Random();
		int numero = gerador.nextInt(3);
		if (numero == 0) {
			return Escolha.PAPEL;
		}else if(numero == 1) {
			return Escolha.PEDRA;
		}else {
			return Escolha.TESOURA;
		}
		 // retornar uma escolha
	}
}