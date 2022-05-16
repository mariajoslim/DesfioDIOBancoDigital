public class BancoFuncional {

	public static void main(String[] args) {
		Cliente marin = new Cliente("");
		marin.setNome("Maria");
		
		Conta cc = new ContaCorrente(marin);
		Conta poupanca = new ContaPoupanca(marin);

		cc.depositar(1000);
		cc.transferir(200, poupanca);
		cc.sacar(300);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
