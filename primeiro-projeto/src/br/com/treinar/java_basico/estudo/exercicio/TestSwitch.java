package br.com.treinar.java_basico.estudo.exercicio;

public class TestSwitch {

	public static void main(String[] args) {
		int opcao = 1;
		switch (opcao) {
		case 1:
			System.out.println("UM");
			break;
		case 2:
			System.out.println("DOIS");
			break;
		case 3:
			System.out.println("TRÊS");
			break;
		case 4:
			System.out.println("QUATRO");
			break;
		case 5:
			System.out.println("CINCO");
			break;

		default:
			System.out.println("INVÁLIDO");
			break;
		}
	}
	
}
