package br.com.residencia.poo.aula2;

import java.util.Scanner;

public class SegundoExercicioPdf1 {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		   // float n1, n2, n3, n4, n5, minhaidade, soma;
		  
		 int idade = 0 , soma = 0, somanotas = 0, minhaidade=0;
	
			
				Scanner ler = new Scanner(System.in);
		     
			/* 	System.out.println("Diga sua idade: ");
		        n1 = ler.nextInt();
		        System.out.println("Diga sua idade: ");
		        n2 = ler.nextInt();
		        System.out.println("Diga sua idade: ");
		        n3 = ler.nextInt();
		        System.out.println("Diga sua idade: ");
		        n4 = ler.nextInt();
		        System.out.println("Diga sua idade: ");
		        n5 = ler.nextInt();
		        System.out.println("Vou digitar minha idade: ");
		        minhaidade = ler.nextInt();
		        soma = n1 + n2 + n3 + n4 + n5 + minhaidade;
		 
			 System.out.printf("O tempo de vida meu e dos meus colegas  " + soma);  */
		     
		     
		      for(int cont= 1; cont <= 5; cont++){
		    	  System.out.printf("Qual é a idade do colega " + cont + ":");
		          idade = ler.nextInt();
		          somanotas = (somanotas + idade);
		     }
		      System.out.printf("Vou Digitar minha Idade: " );
	          minhaidade = ler.nextInt();
	          somanotas = (somanotas + minhaidade);
		      
		      System.out.printf("O tempo de vida meu e dos meus colegas é  " + somanotas + ":");
		    	 ler.close();
	}
}



/*O programa “Tempo de vida” irá imprimir a soma das idades de todos os
colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não
esqueça a sua! Depois faça a atribuição direta da expressão em uma
variável inteira.
Exemplo:
Qual é a idade do colega 1? 20
Qual é a idade do colega 2? 24
Qual é a idade do colega 3? 27
Qual é a idade do colega 4? 30
Qual é a idade do colega 5? 18
Qual é a minha idade? 44
O tempo de vida meu e dos meus colegas é 163. */