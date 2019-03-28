package pedraPapelTesoura;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jogador jogador1 = new Jogador("Rafael", Escolha.PAPEL);
		Jogador jogador2 = new Jogador("José", Escolha.TESOURA);
		Computador computador = new Computador();

		Regras regras = new Regras();
		System.out.println("***********************************************************");
		Jogador ganhador = regras.jogar(jogador1, jogador2);
		if(ganhador != null) {
			System.out.println("O ganhador é " + ganhador.getNome());
		}else {
			System.out.println("Houe empate entre " + jogador1.getNome() + " e " + jogador2.getNome());
		}
		System.out.println("***********************************************************");
		ganhador = regras.jogar(jogador1, computador);
		if(ganhador != null) {
			System.out.println("O ganhador é " + ganhador.getNome());
		}else {
			System.out.println("Houe empate entre " + jogador1.getNome() + " e " + computador.getNome());
		}
		System.out.println("***********************************************************");
		
	}

	protected static void imprimirGanhador (Jogador ganhador) {
		if (ganhador == null) {
			System.out.println("Empate");
			
		}	else {
				
			System.out.println("O ganhador é " + ganhador.getNome());
		}
	}
}

