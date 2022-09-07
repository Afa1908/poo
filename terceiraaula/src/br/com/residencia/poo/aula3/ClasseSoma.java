package br.com.residencia.poo.aula3;

public class ClasseSoma{

	private int gastosAbril = 10000;
	private int gastosMaio = 10000;
	private int gastosJunho = 10000;
	private int soma;
	
	public void MetodoSemestre(int soma) {
		this.setSoma(soma + gastosAbril + gastosMaio + gastosJunho);
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}
}