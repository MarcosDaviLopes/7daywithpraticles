package secondday;

import javax.swing.JOptionPane;

//1. O nome do repositório deverá ser exatamente "desafio-7dias-java"
//2. Os exercícios devem ser feitos em Java
//3. Tudo (nome do projeto, pacote, variáveis, métodos) deve usar nomenclatura CamelCase
//4. Somente um commit por dia nesse repositório, não adianta fazer todos em um só dia
//5. Devem ser sete dias seguidos, não espaçados
//6. Quatro exercícios devem ser usando Swing do Java
//7. Os demais exercícios devem usar vetor e método
//7.Os exercícios devem ser das listas de fixação de VETOR ou SWING

public class Praticas2 {
	public static void main(String[] args) {
		
		String[] nome = new String[1];
		float[] Notas = new float[3];
		
		for (int i = 0; i < nome.length; i++) {
			nome[i] = JOptionPane.showInputDialog(null, "digite seu nome: ");
			for (int j = 0; j < Notas.length; j++) {
				String notas = JOptionPane.showInputDialog(null, "digite suas notas ");
				float N1 = Float.valueOf(notas);
				Notas[i] = N1;
				System.out.println(Notas[i]);
			}
			Float Media  = CalcMedia(Notas);
			JOptionPane.showMessageDialog(null, Media);
		}
	}
	public static Float CalcMedia(float[] Notas) {
		float media = 0;
		for (int i = 0; i < Notas.length; i++) {
			media += Notas[i];
			System.out.println(Notas[i]);
		}
		media = (media)/3; 

		return media;
		}
}