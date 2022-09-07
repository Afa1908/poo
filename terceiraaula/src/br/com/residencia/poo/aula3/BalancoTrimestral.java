package br.com.residencia.poo.aula3;


public class BalancoTrimestral {
	public static void main (String[] args) {	
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int soma = gastosJaneiro + gastosFevereiro + gastosMarco;

		ClasseSoma Semestre = new ClasseSoma(soma);
		MetodoAno Ano = new MetodoAno(Semestre.getSoma());
				
		System.out.println("O gasto total no Trimestre = " + soma);
		System.out.println("O gasto total no Semestre = " + Semestre.getSoma());
		System.out.println("O gasto total no Ano = " + Ano.getSoma());
	}

}
