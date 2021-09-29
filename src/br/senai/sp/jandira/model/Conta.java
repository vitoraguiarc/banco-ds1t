package br.senai.sp.jandira.model;

public class Conta {
	
	// Atributos da classe Conta
	public String tipo;
	private String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;
	
	
	// Construtores da classe Conta
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	// Métodos da classe Conta
	public void depositar(double valorDeposito) {
		
		System.out.println("");
		System.out.println("Efetuando depósito...");
		
		if (valorDeposito > 0) {
			saldo += valorDeposito;
			System.out.println("Depósito efetuado com sucesso :))");
			System.out.println("Foi depositado " + valorDeposito + " na conta da(o) " + titular);
		} else {
			System.out.println("Não foi possível efetuar o depósito :(("
					+ "\nO valor do deposito deve ser maior que 0");
		}
	}
	
	public boolean sacar(double valorSaque) {
		
		System.out.println("");
		System.out.println("Efetuando saque...");
		
		if (valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
			System.out.println("Saque realido com sucesso :))");
			System.out.println("Foi feito um saque de " + valorSaque + " da conta da(o) " + titular);
			return true;
		} else {
			System.out.println("Não foi possível sacar :(("
					+ "\n!! O valor do saque deve ser maior que 0 e dentro do limite da conta !!");
			return false;
		} 
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		
		System.out.println("");
		System.out.println("Efetuando transfêrencia...");
		
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Não foi possível realizar a transferência");
		}
		
		
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
