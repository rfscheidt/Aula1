package br.com.aula;

import javax.swing.JOptionPane;

public class Av2Rafael {
	
	public static void fazerAlgumaCoisa() {
		
	}
	
	public static void main(String[] args) {

		int opcaoGeralDoSistema = 0;
		int op2 = 0;
		int codigoCandidato1 = 0;
		int cod2 = 0;
		int cod3 = 0;
		int cod4 = 0;
		int codigoCandidato5 = 0;
		int totalVotos=0;

		do {
			try {
				opcaoGeralDoSistema = Integer.valueOf(JOptionPane.showInputDialog("O que você deseja: \n 1) Deseja votar \n 2) Mostrar resultados e sair"));
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}

			if(opcaoGeralDoSistema == 1) {
				try {
					op2=Integer.parseInt(JOptionPane.showInputDialog("Código: 1\nNome: Angela Pepino\nPartido: PMDB\n\n"
							+ "Código: 2\nNome: Gean da Silva\nPartido: PT\n\n"
							+ "Código: 3\nNome: Cesar Souza Neto\nPartido: DEM\n\n"
							+ "Código: 4\nNome: Voto Nulo\n\n"
							+ "Código: 5\nNome: Voto em Branco\n\n"));
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}

				switch(op2) {
					case 1:
						codigoCandidato1++;
						totalVotos++;
						break;
					case 2:
						cod2++;
						totalVotos++;
						break;
					case 3:
						cod3++;
						totalVotos++;
						break;
					case 4:
						cod4++;
						totalVotos++;
						break;
					case 5: 
						codigoCandidato5++;
						totalVotos++;
						break;
				}
			} else {
				if(codigoCandidato1 == 2) {
					System.out.println("Calculando Votação...");
				} else {
					System.out.println("Entrada Inválida");
				}
			}
		} while (codigoCandidato1 != 2);

		System.out.println("Código: 1\nNome: Angela Pepino\nPartido: PMDB\n Total de Votos: "+codigoCandidato1 +"\n\n"
				+ "Código: 2\nNome: Gean da Silva\nPartido: PT\nTotal de Votos: "+cod2 +"\n\n"
				+ "Código: 3\nNome: Cesar Souza Neto\nPartido: DEM\n Total de Votos: "+cod3 +"\n\n"
				+ "Código: 4\nNome: Voto Nulo\n Total de Votos: "+cod4 +"\n\n"
				+ "Código: 5\nNome: Voto em Branco\n Total de Votos: "+codigoCandidato5 +"\n\n"
				+ "Total de eleitores: "+ totalVotos );
	}

}
