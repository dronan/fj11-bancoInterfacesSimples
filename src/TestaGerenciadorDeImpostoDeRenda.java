
public class TestaGerenciadorDeImpostoDeRenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(0);
		gerenciador.adiciona(cc);
		
		System.out.printf("O saldo Ž %.2f", gerenciador.getTotal());
		
	}

}
