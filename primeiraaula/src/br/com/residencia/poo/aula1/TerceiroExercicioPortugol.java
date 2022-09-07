package br.com.residencia.poo.aula1;

import java.util.Scanner;

public class TerceiroExercicioPortugol {

	public static void main(String[] args) {


		
		Scanner ler = new Scanner(System.in);

	        String nome;
	        int idade;
	        
	        System.out.println("Diga seu nome: ");
	        nome = ler.nextLine();
	  
	        
	        System.out.println("Qual é a sua idade: ");
	        idade = ler.nextInt();
	
	        System.out.printf("Seu nome é " + nome + ", e sua idade é " + idade);
	        
	        ler.close();
		}


	}


