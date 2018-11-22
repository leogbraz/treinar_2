package br.com.treinar.java_basico.estudo.exercicio2;

public class ImprimeNome {

	public static void main(String[] args) {
		for (int i = 10, j = 1; i >= 1; i--, j++) {
			System.out.println((i >= 10 ? i : "0" + i) + " :Leo " + (j >= 10 ? j : "0" + j));
		}
	}

}
