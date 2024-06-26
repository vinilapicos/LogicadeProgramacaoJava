package listaVetores;
// Frequência de Elementos: Crie um programa que determine a frequência de cada elemento único em um vetor.
public class Exercicio6 {
	    public static void main(String[] args) {
	        int []vetor = {1,2,1,1,2,3,3,4,4,4,4};
	        boolean[] valorRepetido = new boolean[vetor.length];
	        
	        for (int i = 0; i < vetor.length; i++) {
	            int valorAtual = vetor[i];
	            int quantidade = 0;
	            
	            if (!valorRepetido[i]) {
	                for (int j = i; j < vetor.length; j++) {
	                    if (vetor[j] == valorAtual) {
	                        quantidade++;
	                        valorRepetido[j] = true;
	                    }
	               }
	                
	                System.out.println("A quantidade de vezes que o valor " + valorAtual + " aparece no vetor é " + quantidade);
	           }
	       }
	   }
}