package br.com.treinar.java_basico.estudo.exercicio;
//Inserir um tempo inteiro qualquer e informar quantos minutos e segundos corresponde este numero
public class Tempo {
	public static void main(String[] args) {
		int tempo = 601;
		int minuto;
		int segundo;
		
		System.out.println("Tempo inserido: " + tempo + " segundos");
		minuto = tempo / 60;
		segundo = tempo % 60;
		System.out.println("Corresponde a: " + (minuto >= 10 ? minuto : "0"+ minuto) + ":" + (segundo >= 10 ? segundo : "0"+ segundo));
		//usando a lógica ternária para inserir um "0" ao lado esquerdo do número para ficar visualmente agradável
	}

}
