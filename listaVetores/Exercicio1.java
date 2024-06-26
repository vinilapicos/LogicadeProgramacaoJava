package listaVetores;
// Soma dos Elementos: Escreva um programa que calcule a soma de todos os elementos de um vetor de inteiros.
public class Exercicio1 {
	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		int soma = 0;
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println("A soma de todos os elementos do vetor é "+soma);
	}
}
