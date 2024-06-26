package listaVetores;
import java.util.Arrays;
//Vetor Invertido: Implemente um programa que inverta a ordem dos elementos em um vetor.
public class Exercicio4 {
	public static void main(String[] args) {
		int vetor1[] = {1,2,3,4,5,6,7,8,9,10};
		int[] vetor2 = new int[vetor1.length];
		int j = 0;
		for(int i = vetor1.length-1; i>=0; i--) {
			vetor2[j] = vetor1[i];
			j++;
		}
		vetor1 = vetor2;
		System.out.println(Arrays.toString(vetor1));
	}
}