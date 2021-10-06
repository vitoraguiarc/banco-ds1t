package br.senai.sp.jandira.model;

import br.senai.sp.lista.TipoConta;

public class Conta {
	
	// Atributos da classe Conta
	private TipoConta tipo;
	private String numero;
	private Cliente titular;
	private double saldo;
	private Agencia agencia;
	
	
	// Construtores da classe Conta
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	// M�todos de acesso
	public void setTipo(TipoConta tipo){
		
		this.tipo = tipo;
		
	}
	
	public TipoConta getTipo(){
		return this.tipo;
	}
	
	public void setAgencia(Agencia agencia){
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular () {
		return this.titular;
	}
	
	
	// M�todos da classe Conta
	public void depositar(double valorDeposito) {
		
		System.out.println("");
		System.out.println("Efetuando dep�sito...");
		
		if (valorDeposito > 0) {
			saldo += valorDeposito;
			System.out.println("Dep�sito efetuado com sucesso :))");
			System.out.println("Foi depositado " + valorDeposito + " na conta da(o) " + titular.getNome());
		} else {
			System.out.println("N�o foi poss�vel efetuar o dep�sito :(("
					+ "\nO valor do deposito deve ser maior que 0");
		}
	}
	
	public boolean sacar(double valorSaque) {
		
		System.out.println("");
		System.out.println("Efetuando saque...");
		
		if (valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
			System.out.println("Saque realido com sucesso :))");
			System.out.println("Foi feito um saque de " + valorSaque + " da conta da(o) " + titular.getNome());
			return true;
		} else {
			System.out.println("N�o foi poss�vel sacar :(("
					+ "\n!! O valor do saque deve ser maior que 0 e dentro do limite da conta !!");
			return false;
		} 
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		
		System.out.println("");
		System.out.println("Efetuando transf�rencia...");
		
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel realizar a transfer�ncia");
		}
		
		
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular.getNome());
		System.out.printf("E-mail: %s\n", titular.getEmail());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", agencia.getNumero());
		System.out.printf("Gerente: %s\n", agencia.getGerente());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
