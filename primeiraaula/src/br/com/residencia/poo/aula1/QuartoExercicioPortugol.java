package br.com.residencia.poo.aula1;

import java.util.Scanner;

public class QuartoExercicioPortugol {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		double nota1, nota2, nota3, totalNotas, media;
		String disciplina, nome;

		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();

		System.out.println("Digite sua Disciplina: ");
		disciplina = ler.nextLine();

		System.out.println("Digite sua primeira nota: ");
		nota1 = ler.nextDouble();

		System.out.println("Digite sua segunda nota: ");
		nota2 = ler.nextDouble();

		System.out.println("Digite sua terceira nota: ");
		nota3 = ler.nextDouble();

		totalNotas = nota1 + nota2 + nota3;
		media = totalNotas / 3;

		System.out.printf("\nOlá, " + nome + ".\n");
		System.out.printf("Na disciplina " + disciplina + " , sua média foi " + media);
	}

}
