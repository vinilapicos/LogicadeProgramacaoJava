package listaVetores;
//Maior e Menor Valor: Crie um programa que encontre o maior e o menor valor em um vetor de números inteiros.
public class Exercicio2 {
	public static void main(String[] args) {
		int vetor [] = {9,2,7,5,1,3,6,8,12,34};
		int maior = vetor[0];
		int menor = vetor[0];
		for(int i = 0; i<vetor.length; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
			if (menor > vetor[i]) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior valor do vetor é o "+maior+" e o menor valor é "+menor);
		System.out.println(vetor.length);
	}
}
