package br.com.residencia.poo.aula2;

import java.util.Scanner;

public class TerceiroExerciciopdf {

	public static void main(String[] args) { 
		Double n1, n2, soma = 0.0, subtracao =0.0,multiplicacao = 0.0,divisao = 0.0;
		int opcao = 0;
		
		Scanner ler = new Scanner(System.in);

      System.out.println("Digite um numero: ");
      n1 = ler.nextDouble();
     
      System.out.println("Digite um numero: ");
      n2 = ler.nextDouble();
      
      System.out.println("Digite '1' para soma \nDigite '2' para Subtração \nDigite '3' para multiplicação \nDigite '4' para divisão: \\n ");
     opcao = ler.nextInt();
     ler.close();
      
      switch (opcao) {
      case 1:
    	  soma = n1 + n2;
    	  System.out.println("A soma é, " + soma);
          break;
          
      case 2:
    	  subtracao = n1 - n2;
    	  System.out.println("A subtração é, " + subtracao);
      	break;
      	
      case 3:
    	  multiplicacao = n1 * n2;
    	  System.out.println("A multiplicação é, " + multiplicacao);
          break;
          
      case 4:
    	  if (n1 == 0 && n2 == 0) {
     		 System.out.println("Opção Inválida! ");  
     	  } else {
    	  divisao = n1 / n2;
    	  System.out.println("A divisão é, " + divisao );
          break;
     	  }
    	  
      default:
    	  System.out.println("Opção Inválida! ");
          break;
          
         
      }
      
      
	} 
}
	



/* Crie o programa “mini calculadora”, que após ler dois números inteiros
apresenta as operações de soma, subtração, multiplicação e divisão com
eles.
Obs.: Trate o maior número possível de erros (ex: operações com números
negativos, divisão por zero, uso de letras, etc).
Exemplo:
Número 1: 5
Número 2: -2
Soma: 3
Subtração: 7
Multiplicação: -10
Divisão: -2.5 */



