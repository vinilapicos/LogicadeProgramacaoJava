package listaVetores;
// União de Vetores: Crie um programa que una dois vetores em um terceiro vetor, mantendo a ordem dos elementos.

import java.util.Arrays;

public class Exercicio10 {
	public static void main(String[] args) {
		int []vetor1 = {1,3,5,7,9};
		int []vetor2 = {2,4,6,8,10};
		int []vetor3 = new int[vetor1.length+vetor2.length];
		System.out.println("Primeiro vetor: "+ Arrays.toString(vetor1));
		System.out.println("Segundo vetor: "+ Arrays.toString(vetor2));
		for(int i = 0; i < vetor1.length; i++) {
			vetor3[i] = vetor1[i];
		}
		int k = 0;
		for(int i = vetor1.length; i < vetor3.length; i++) {
			vetor3[i] = vetor2[k];
			k++;
		}
		int controle = 0;
		for(int i = 0; i<vetor3.length -1; i++) {
			for(int j = 0; j<vetor3.length-1-i; j++) {
				if (vetor3[j] > vetor3[j + 1]) {
                    controle = vetor3[j];
                    vetor3[j] = vetor3[j + 1];
                    vetor3[j + 1] = controle;
				}
			}
		}
		System.out.println("A união dos dois vetores é: "+ Arrays.toString(vetor3));
		
	}
}
