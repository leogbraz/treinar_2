package br.com.treinar.java_basico.estudo.exercicio2;

import java.util.Scanner;

public class ImprimeNomeNvezes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();

		System.out.print("Digite a quantidade de repetições: ");
		int x = leitor.nextInt();

		for (int i = x, j = 1; i >= 1; i--, j++) {
			System.out.println((i >= 10 ? i : "0" + i) + " " + nome + " " + (j >= 10 ? j : "0" + j));
		}
		leitor.close();
		if (x <= 0) {
			System.out.println("Quantidade de repetições inválida!");
		} else {
			System.out.println("Impressão finalizada!");
		}
	}

}
