package listaVetores;
// Elementos Pares: Escreva um programa que conte e exiba a quantidade de números pares em um vetor de inteiros.
public class Exercicio5 {
	public static void main(String[] args) {
		int []vetor = {1,2,3,4,5,6,7,8,9,10,11,12};
		int pares = 0;
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i]%2 == 0) {
				pares++;
			}
		}
		System.out.println("No vetor existem "+pares+" números pares.");
	}
}
