
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
	    super.imprimirInfosComuns();
		
	}

	public void gerarTaxa() {
		saldo += saldo * .006;
		System.out.println("O valor acrescido �" +saldo);
	  }

}
