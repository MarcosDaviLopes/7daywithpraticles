package firstday;

import javax.swing.JOptionPane;

//1. O nome do repositório deverá ser exatamente "desafio-7dias-java"
//2. Os exercícios devem ser feitos em Java
//3. Tudo (nome do projeto, pacote, variáveis, métodos) deve usar nomenclatura CamelCase
//4. Somente um commit por dia nesse repositório, não adianta fazer todos em um só dia
//5. Devem ser sete dias seguidos, não espaçados
//6. Quatro exercícios devem ser usando Swing do Java
//7. Os demais exercícios devem usar vetor e método
//7.Os exercícios devem ser das listas de fixação de VETOR ou SWING


public class Praticas1 {
	public static void main(String[] args) {
	
	Integer[] N = new Integer[5];
	
		for (int i = 0; i < N.length; i++) {
		String n  = JOptionPane.showInputDialog("digite 1 numero: ");
		Integer N1 = Integer.valueOf(n);
		N[i] = N1;
		}
	Integer Calc = CalcNubers(N);
	
	JOptionPane.showMessageDialog(null, Calc);
	}
	private static Integer CalcNubers(Integer N[]) {
		int num = 0;
		for (int i = 0; i < N.length; i++) {
		num = num+N[i];
		}
	Integer Soma = num;
	return Soma;
	}
}
