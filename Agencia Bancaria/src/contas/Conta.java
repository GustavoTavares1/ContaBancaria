package contas;

public class Conta {
	//atributos
	String Cliente;
	double saldo;
	public Conta() {
		super();
	System.out.println("Agencia 2167");
		
	}
	void exibirSaldo() {
		System.out.println("Saldo: R$" + saldo);
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("crédito: R$" + valor);
	}
	public void sacar(double valor) {
		saldo -= valor;
		System.out.println("Debito: R$" + valor);
	}
	
	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferencia: R$" + valor);
			
	}
	
	public double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
		
	}
}
