
public class ContaPoupanca implements Conta {

	private double saldo;

	public void atualiza(double taxa){
		this.saldo *= (taxa * 3);
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retira(double valor) {
		// TODO Auto-generated method stub
		
	}

}
