package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;
import br.senai.sp.lista.TipoConta;

public class App {

	public static void main(String[] args) {
		
		// Criar agência
		Agencia agencia = new Agencia();
		agencia.setNumero("4214-9");
		agencia.setGerente("Celso");
		agencia.setTelefone("(11) 96432-7723");
		agencia.setCidade("Jandira");
		
		// Criar o cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Eduarda");
		clienteMaria.setEmail("mariaed@gmail.com");
		clienteMaria.setSalario(2000);
		
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setTitular(clienteMaria);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		contaMaria.setAgencia(agencia);
		
		// Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Henrique");
		clientePedro.setEmail("pedrohenr@gmail.com");
		clientePedro.setSalario(1500);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setTitular(clientePedro);
		contaPedro.depositar(400);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agencia);
		
		// Criar o cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("anag@gmail.com");
		clienteAna.setSalario(2500);
		
		
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("2345-9");
		contaAna.setTitular(clienteAna);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agencia);
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		System.out.println("====> " + contaMaria.getTipo());
		System.out.println("====> " + contaMaria.getAgencia().getNumero());
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		// Depositar 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		// Sacar 300 reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		// Depositar -200 na conta do Pedro
		contaPedro.depositar(-200);
		contaPedro.exibirDetalhes();
		
		// Sacar -100 da conta da Maria
		contaMaria.sacar(-100);
		contaMaria.exibirDetalhes();
		
		/* Transferir 100 reais da conta do Pedro para a conta da Maria */
		contaPedro.transferir(contaMaria, 100);
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();

	}

}
