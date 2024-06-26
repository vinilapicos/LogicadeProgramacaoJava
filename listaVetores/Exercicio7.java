package listaVetores;
import java.util.Arrays;
// Ordenação Crescente: Implemente um algoritmo que ordene os elementos de um vetor em ordem crescente.
public class Exercicio7 {
	public static void main(String[] args) {
		int vetor[] = {9,8,7,6,5,4,3};
		int controle = 0;
		for(int i = 0; i<vetor.length -1; i++) {
			for(int j = 0; j<vetor.length-1-i; j++) {
				if (vetor[j] > vetor[j + 1]) {
                    controle = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = controle;
				}
			}
		}
		System.out.println(Arrays.toString(vetor));
	}
}