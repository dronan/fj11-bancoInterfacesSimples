
public class TestaAtualizadorDeContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(cp);
		adc.roda(cc);
		adc.roda(c);
		
		System.out.println("Saldo total: " + adc.getSaldoTotal());
	}

}
