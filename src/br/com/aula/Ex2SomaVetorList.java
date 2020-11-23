package br.com.aula;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex2SomaVetorList {
	
	public static void main(String[] args) {
		int n = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor"));
		
		List<Integer> vetor = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			vetor.add(Integer.valueOf(JOptionPane.showInputDialog(null, "Digite valor do vetor na posicao " + i)));
		}
		
		int soma = 0;
		for (int i = 0; i < vetor.size(); i++) {
			soma += vetor.get(i);
		}
		
		System.out.println("a soma é: " + soma);
		
	}

}
