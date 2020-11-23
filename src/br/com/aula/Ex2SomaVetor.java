package br.com.aula;

import javax.swing.JOptionPane;

public class Ex2SomaVetor {

	public static void main(String[] args) {
		int n = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor"));
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite valor do vetor na posicao " + i));
		}
		
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		System.out.println("a soma é: " + soma);
		
	}

}
