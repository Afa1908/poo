package br.com.residencia.poo.aula2;

import java.util.Scanner;

public class PrimeiroExercicioPdf {    

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		
		String nome;
        String sobrenome;
        
        System.out.println("==============================");
		System.out.println("Bem-Vindo");
		System.out.println("==============================");
        System.out.println("Diga seu nome: ");
        nome = ler.nextLine();
        System.out.println("Diga seu sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.println("Olá " + nome + " " + sobrenome + ", seja bem-vinda ao universo da programação! ");
        System.out.println("==============================");
      
        ler.close();

	}

}
