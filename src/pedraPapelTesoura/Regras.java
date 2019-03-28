package pedraPapelTesoura;

public class Regras {

	public Jogador jogar(Jogador jogador, Jogador adversario) {
		Resultado resultado = null;
		System.out.println("JOGO ENTRE " + jogador.getNome() + " e " + adversario.getNome());
		System.out.println(jogador.getNome() + " escolheu " + jogador.getEscolha());
		System.out.println(adversario.getNome() + " escolheu " + adversario.getEscolha());
		switch (jogador.getEscolha()) {
		case PAPEL:
			resultado = this.compararComPapel(adversario.getEscolha());
			break;
		case PEDRA:
			resultado = this.compararComPedra(adversario.getEscolha());
			break;
		case TESOURA:
			resultado = this.compararComTesoura(adversario.getEscolha());
			break;
		}
		
		if(resultado == Resultado.GANHOU) {
			return jogador;
		} else if (resultado == Resultado.PERDEU) {
			return adversario;
		}
		return null;
	}

	protected Resultado compararComPedra(Escolha escolha) {
		Resultado resultado = null;

		switch (escolha) {
		case PAPEL:
			resultado = Resultado.PERDEU;
			break;

		case PEDRA:
			resultado = Resultado.EMPATOU;
			break;

		case TESOURA:
			resultado = Resultado.GANHOU;
			break;
		}

		return resultado;
	}

	protected Resultado compararComPapel(Escolha escolha) {
		Resultado resultado = null;

		switch (escolha) {
		case PAPEL:
			resultado = Resultado.EMPATOU;
			break;

		case PEDRA:
			resultado = Resultado.GANHOU;
			break;

		case TESOURA:
			resultado = Resultado.PERDEU;
			break;
		}

		return resultado;
	}

	protected Resultado compararComTesoura(Escolha escolha) {
		Resultado resultado = null;

		switch (escolha) {
		case PAPEL:
			resultado = Resultado.GANHOU;
			break;

		case PEDRA:
			resultado = Resultado.PERDEU;
			break;

		case TESOURA:
			resultado = Resultado.EMPATOU;
			break;
		}

		return resultado;
	}
}

//if (jogador1.getEscolha() == 1 && jogador2.getEscolha() == 2) { // .getEscolha pega a vari�vel escolha do objeto																// new Jogador
//	return jogador2;
//
//} else if (jogador1.getEscolha() == 2 && jogador2.getEscolha() == 1) {
//	return jogador1;
//
//} else if (jogador2.getEscolha() == 2 && jogador1.getEscolha() == 3) {
//	return jogador1;
//}
