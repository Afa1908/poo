package br.com.residencia.poo.erros;

import java.util.Scanner;

public class ConversaoErro {

	public static void main (Float [] args) { // nao é Float, é String
		
	Scanner ler = new Scanner(System.in); //Scanner deve ser finalizado no final
	
	double tempC , tempF;
	

	System.out.println ("Digite a temperatura em Celcius a ser convertida: ");
	tempC = ler.nextFloat(); // o correto é ser "nextDouble
	
	tempF = (tempC*1.8+32);
	System.out.printf(tempC + "° é equivalente a: " , tempF + "°F"); // substituir a vírgula pelo "+"
		
	ler.close();
	}

}