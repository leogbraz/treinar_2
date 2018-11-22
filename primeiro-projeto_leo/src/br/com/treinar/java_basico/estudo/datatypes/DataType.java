package br.com.treinar.java_basico.estudo.datatypes;

public class DataType {
	// www.tutorialspoint.com
	public static void main(String[] args) {
		byte a = 100;
		System.out.println(a);
		short s = 10000;
		System.out.println(s);
		int i = 10000000;
		System.out.println(i);
		long l = 999999999;
		System.out.println(l);
		float f1 = (float) 234.5; // faz a conversão do numero "double" para o float... faz um casting.
		System.out.println(f1);
		double d1 = 1.5;
		System.out.println(d1);
		boolean possuiFichaCriminal = true;
		System.out.println("A Pessoa possui ficha criminal: " + possuiFichaCriminal);
		char letraA = 'A';
		char letraB = 'B';
		char letraUnicode = 181;
		System.out.println(letraA);
		System.out.println(letraB);
		System.out.println(letraUnicode);

	}

}
