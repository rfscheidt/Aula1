package br.com.aula;

import br.com.aula2.Calculadora;

public class ExemploFuncao {

	public static void main(String[] args) {
		double nota1 = 5;
		double nota2 = 5;
		double nota3 = 5;
		
		double mediaCalculada = Calculadora.calcularMedia(nota1, nota2, nota3);
		System.out.println(mediaCalculada);
	}
	

}
