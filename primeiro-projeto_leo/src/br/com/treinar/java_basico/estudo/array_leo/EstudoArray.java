package br.com.treinar.java_basico.estudo.array_leo;

public class EstudoArray {

	public static void main(String[] args) {
		String[] nomes = null;
		// System.out.println("xpto");
		nomes = new String[10];
		// int[] numeros = new int[10];
		nomes[0] = "Maria Sophia";
		nomes[1] = "Joao Carlos";
		nomes[2] = "Juan Pablo";
		nomes[3] = "Nathalia";
		nomes[4] = null;
		nomes[5] = "Maria Cecilia";
		nomes[6] = "Davi lucas";

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i] != null) {
				System.out.print("\nPosição do Array= " + i + " : ");
				System.out.print(nomes[i]);
			}
		}
	}

}
