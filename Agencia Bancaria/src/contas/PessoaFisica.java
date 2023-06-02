package contas;

public class PessoaFisica {

	public static void main(String[] args) {
			
		Conta cc1 = new Conta();
			cc1.Cliente = "Leandro Ramos";
			cc1.saldo = 10000;
			System.out.println("Cliente: " + cc1.Cliente);
			cc1.exibirSaldo();
			cc1.depositar(5000);
			cc1.exibirSaldo();
			System.out.println("---------------------------");
			Conta cc2 = new Conta();
			cc2.Cliente = "Sirlene Sanches";
			cc2.saldo = 5000;
			System.out.println("Cliente: " + cc2.Cliente);
			cc2.exibirSaldo();
			cc2.sacar(1000);
			cc2.exibirSaldo();
			System.out.println("---------------------------");
			System.out.println("");
			System.out.println("Cliente: " + cc1.Cliente);
			cc2.exibirSaldo();
			System.out.println("Favorecido: " + cc2.Cliente);
			cc2.exibirSaldo();
			System.out.println("-----------------------------");
			System.out.println("");
			System.out.println("Relatorio Gerencial");
			Conta gerente = new Conta();
			double total = gerente.soma(cc1.saldo, cc2.saldo);
			System.out.println("Saldo total: R$" + total);
			
	
	}

}
