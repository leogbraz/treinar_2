package br.com.treinar.java_basico.estudo.array_leo;

public class EstudoMatriz {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24, 25 } };

		System.out.print("Impressão de posição de teste: ");
		System.out.print("A posição:  matriz[2][0]: ");
		System.out.println(matriz[2][0]);
		System.out.println();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
