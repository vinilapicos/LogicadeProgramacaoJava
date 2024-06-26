package listaVetores;
//Média dos Elementos: Desenvolva um programa que calcule a média dos elementos em um vetor de números reais.
public class Exercicio3 {
	public static void main(String[] args) {
		float[] vetor = {10.4f,34.5f,12.1f,25.2f,4.1f,3.4f,2.1f,4.2f};
		float soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println("A média dos elementos do vetor é "+soma/vetor.length);
	}
}
