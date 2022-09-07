package br.com.residencia.poo.erros;

import java.util.Scanner;

public class CalculadoraErro {

		public static void main(Float[] args) { // nao é Float, é String
			
		}
			Scanner ler = new Scanner(System.in); //Scanner deve ser finalizado no final
			
			double n1 = 0, n2, soma, sub, mult, div;
			int oper;
			
			System.out.println ("Digite o 1º valor: ");
			n1 = ler.nextDouble();
			System.out.println ("Digite o 2º valor: ");
			n2 = ler.nextDouble();
			System.out.printf ("Escolha uma operação: " + "\n" + "1 para SOMAR" +
			"\n" + "2 para SUBTRAIR" , "\n" + "3 para MULTIPLICAR" , "\n" + "4 para DIVIDIR" + "\n");
			//substituir a "," por "+" depois do "SUBTRAIR" e "MULTIPLICAR"
			System.out.println ("_____ ");
			oper = ler.nextInt();
			
			if(oper== 1){
			soma=(n1+n2);
					System.out.println ("O resultado é: " + soma);
					
			}else if (oper> 4){
				System.out.println ("\n" + "Opção inválida, volte e escolha umas das opções sugeridas: 1,2,3 ou 4!");
			
			}else if (oper== 2){
			sub=(n1-n2);
					System.out.println ("O resultado é: " + sub);
			
			}else if (oper== 3){
			mult=(n1*n2);
			System.out.println ("O resultado é: " + mult);
			
			}else if (oper== 4)
			
			{if(n2 == 0){ // para a operação ser correta n2 deve ser != de 0
			div=(n1/n2);
			System.out.println ("O resultado é: " + div);
			
			}else {
			
				System.out.println ("Não se pode dividir um número por zero!");
			}
			

			}
	}}
