public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("==**= Extrato Conta Corrente =**==");
		super.imprimirInfosComuns();
	}
	 public void gerarTaxa() {//tx de manutenção de conta
	     saldo -= 18.00;
	     System.out.println("O valor do saldo é" +saldo);
	   }
	
}