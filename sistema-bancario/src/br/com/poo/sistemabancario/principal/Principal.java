package br.com.poo.sistemabancario.principal;

import br.com.poo.sistemabancario.contas.Contas;

public class Principal {

	public static void main(String[] args) {

		Contas minhaConta = new Contas("Quézia", 123,  1000.0);
		Contas novaConta = new Contas("Sulamita", 456, 900.0);

		
		minhaConta.sacar(200.0);
		minhaConta.depositar(20.0);
		
		
		
		minhaConta.transferir(novaConta, 400.0);
		
		
		
			System.out.println("\nNome do titular: " + minhaConta.titular 
			+ "\nNúmero da conta: " + minhaConta.numero 
			+ "\nSaldo atual: " + minhaConta.saldo);
			System.out.println("\nNome do titular: " + novaConta.titular 
			+ "\nSaldo atual: " + novaConta.saldo 
			+ "\nNome do titular: " + novaConta.titular); 

	
	}
}