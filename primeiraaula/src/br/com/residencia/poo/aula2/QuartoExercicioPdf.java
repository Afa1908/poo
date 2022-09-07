package br.com.residencia.poo.aula2;

import java.util.Scanner;

public class QuartoExercicioPdf {
	

		public static void main(String[] args) { 
			double numero, conversao;
			
		  
		Scanner ler = new Scanner(System.in);
		  
		  System.out.println("Digite um numero: ");
	      numero = ler.nextDouble();
	      conversao =  (numero * 1.8 )+ 32;
	      System.out.println("Temperatura em Cº: " + numero);
	      System.out.println("Temperatura em Fº: " + conversao);
	      
	      ler.close();
		}
}


/*O programa “termômetro” lê uma temperatura em graus celsius, e devolve
sua equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)
Exemplo:
Temperatura em °C: 30°
Temperatura em °F: 86°  */