package br.com.treinar.java_basico.estudo.exercicio_classe;

public class Oculos {

	float grau;
	String tipo;
	int foco;

	void aproximar() {

		foco++;

	}

	void afastar() {

		foco--;
	}

	void aumentaGrau() {
		grau++;
	}
	
	/**
	 * 
	 * @param modificaGrau Informa o valor desejado para aumentar o valor do grau
	 * @return Retorna o valor do grau aumentado conforme parâmetro recebido: grau + valor desejado
	 */
	float aumentaGrau(float modificaGrau) {
		grau = grau + modificaGrau;
		return grau;
	}
	
	/**
	 * 
	 * @param modificaGrau Informa o valor desejado para diminuir o valor do grau
	 * @return Retorna o valor do grau reduzido conforme parâmetro recebido: grau - valor desejado
	 */
	float diminuiGrau(float modificaGrau) {
		grau = grau - modificaGrau;
		return grau;
	}

}
