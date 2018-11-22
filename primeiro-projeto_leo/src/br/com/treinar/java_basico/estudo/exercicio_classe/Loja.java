package br.com.treinar.java_basico.estudo.exercicio_classe;

public class Loja {

	public static void main(String[] args) {

		// Instancia novo objeto1
		Oculos venda1 = new Oculos();
		venda1.tipo = "ESCURO";
		venda1.grau = 1.5F;
		venda1.foco = 10;

		System.out.println("Primeiro objeto criado");
		System.out.println("Venda de um óculos " + venda1.tipo + " com lente de " + venda1.grau + " graus");
		System.out.println("Foco do oculos " + venda1.tipo + " atual: " + venda1.foco);
		// Ajuste de foco acrescentar
		venda1.aproximar();
		System.out.println("Foco do oculos " + venda1.tipo + " ajustado +: " + venda1.foco);
		venda1.afastar();
		venda1.afastar();
		System.out.println("Foco do oculos " + venda1.tipo + " ajustado -: " + venda1.foco);
		venda1.aumentaGrau(2F);
		System.out.println("Grau aumentado para: " + venda1.grau);

		venda1.diminuiGrau(1F);// metodo com retorno
		System.out.println("Grau reduzido para: " + venda1.grau);

		venda1.aumentaGrau();// metodo sem retorno
		System.out.println("Aumenta 1 grau: " + venda1.grau);

		// Instancia novo objeto2
		Oculos venda2 = new Oculos();
		venda2.tipo = "RAY BAN";
		venda2.grau = 0.0F;

		System.out.println("\nSegundo objeto criado");
		System.out.println("Venda de um óculos " + venda2.tipo + " com lente de " + venda2.grau + " graus");

		// Instancia novo objeto3
		Oculos venda3 = new Oculos();
		venda3.tipo = "AVIADOR";
		venda3.grau = 0.5F;

		System.out.println("\nTerceiro objeto criado");
		System.out.println("Venda de um óculos " + venda3.tipo + " com lente de " + venda3.grau + " graus");

	}

}
