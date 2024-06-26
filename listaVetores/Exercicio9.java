package listaVetores;

//Remover Elemento: Desenvolva um programa que remova todas as ocorrências de um elemento específico de um vetor.
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []vetor = {1,2,3,4,2,5,6,7,3,10};
		System.out.println("Vetor antes das modificações: "+ Arrays.toString(vetor));
		System.out.println("Digite o valor a ser retirado do vetor:");
		int valor = sc.nextInt();
		int contador = 0;

		for (int i = 0; i < vetor.length; i++) {
			if(valor != vetor[i]) {
				contador++;
			}
		}
		int []novoVetor = new int[contador];
		int j = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(valor != vetor[i]) {
				novoVetor[j++] = vetor[i];
			}
		}
		if(contador != 0) {
			System.out.println("Vetor após modificações: "+ Arrays.toString(novoVetor));
		} else {
			System.out.println("Vetor após modificações: "+ Arrays.toString(vetor));
		}
		sc.close();
	}
}
