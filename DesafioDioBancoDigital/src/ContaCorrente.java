public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("==**= Extrato Conta Corrente =**==");
		super.imprimirInfosComuns();
	}
	 public void gerarTaxa() {//tx de manuten��o de conta
	     saldo -= 18.00;
	     System.out.println("O valor do saldo �" +saldo);
	   }
	
}