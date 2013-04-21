public class ContaCorrente implements Conta {
	private double saldo;


	public void atualiza(double taxa) {
		this.saldo *=  (taxa * 2);
	}

	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor - 0.10;
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}


	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void retira(double valor) {
		// TODO Auto-generated method stub
		
	}

}
