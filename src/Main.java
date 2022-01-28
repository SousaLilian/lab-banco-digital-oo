
public class Main {

	public static void main(String[] args) {
		Cliente Lilian = new Cliente();
		Lilian.setNome("Lilian");

		Conta cc = new ContaCorrente(Lilian);
		Conta poupanca = new ContaPoupanca(Lilian);

		cc.depositar(1500);
		cc.transferir(300, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
