package br.com.residencia.poo.aula2;

import java.util.Scanner;

public class QuintoExercicioPdf {

	public static void main(String[] args) {
		int numero = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66, numero1 = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
		
		
		 Scanner ler = new Scanner(System.in);
			
		 
		System.out.println("O resultado da expressão é " + numero);
		System.out.println("O resultado da expressão é " + numero1);
	     
		ler.close();
	}

}
/*5. O programa “Riuju” escreve na tela o resultado das expressões abaixo:
a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
Exemplo:
O resultado da expressão é 256.

b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9

Exemplo:
O resultado da expressão é 2421.*/