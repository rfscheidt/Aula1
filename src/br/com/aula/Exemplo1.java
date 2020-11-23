package br.com.aula;

import javax.swing.JOptionPane;

public class Exemplo1 {

	public static void main(String[] args) {
		int n1 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite seu nome"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite seu sobre nome"));
		
		if (n1 >= n2)
			System.out.println("escreve é maior");
		else
			System.out.println("escreve nao é maior");
		
		while (n1 > 3) {
			
		}
		
		do {
			//as fkjahsdf kljahsdlfk jahlsdjkfa
			n1 = n1 + 1;
		} while (n1 > 3);
		
		for (int i = 1; i < 100000; i++) {
			break;
		}

	}

}
