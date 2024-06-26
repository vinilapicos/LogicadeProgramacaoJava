package listaVetores;
//Buscar Elemento: Escreva um programa que verifique se um determinado elemento está presente em um vetor.

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a ser encontrado no vetor:");
		int valor = sc.nextInt();
		boolean presenteVetor = false;
		int []vetor = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < vetor.length; i++) {
			if (valor == vetor[i]) {
				System.out.println("O valor "+valor+ " está no vetor.");
				presenteVetor = true;
				break;
			}
		}
		if(!presenteVetor) {
			System.out.println("O valor não está no vetor.");
		}
		sc.close();
	}
}