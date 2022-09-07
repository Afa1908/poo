package br.com.poo.sistemabancario.contas;

public class Contas {

		public String titular;
		public int numero;
		public double saldo;

		public boolean sacar(double valor) {
			if (this.getSaldo() < valor) {
				System.out.println("Saldo insuficiente!");
				return false;
			} else {
				double novoSaldo = this.getSaldo() - valor;
				this.setSaldo(novoSaldo);
				return true;
			}

		}

		public boolean depositar(double valor) {
			if (valor < 0) {
				System.out.println("Valor inválido!");
				return false;
			} else {
				this.setSaldo(this.getSaldo() + valor);
			// this.saldo = this.saldo + valor; é a mesma coisa de cima.
				return true;
			}
		}
		
		//public void tranferir (Conta destino, double valor ) {
			//destino.depositar(valor);
			//this.sacar(valor);
		
		public boolean transferir (Contas contaDestino, double valor) {
		    if(this.getSaldo() >= valor) {
		        this.setSaldo(this.getSaldo() - valor);
		        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		        return true;
		    } else {
		    	System.out.println("Valor Indisponivel!");
		        return false;
		    }
			
	
		
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public Contas() {
			super();
		
		}

		public Contas(String titular, int numero, double saldo) {
			super();
			this.titular = titular;
			this.numero = numero;
			this.setSaldo(saldo);
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
}	

			
			
	