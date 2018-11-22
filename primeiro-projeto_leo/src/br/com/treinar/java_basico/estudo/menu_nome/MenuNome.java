package br.com.treinar.java_basico.estudo.menu_nome;

import java.util.Scanner;

public class MenuNome {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int opcao = 1;
		do {
			System.out.print("Digite o nome: ");
			String nome = leitor.nextLine();

			System.out.println("O nome digitado foi: " + nome);

			System.out.print("Gostaria de informar mais nomes? Digite 1 para sim e 0 para não: ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			if (opcao != 1 && opcao != 0) {
				System.out.println("Opção incorreta!");
				opcao = 0;
			}

		} while (opcao == 1);
		leitor.close();

		System.out.println("Programa encerrado!");

	}

}
