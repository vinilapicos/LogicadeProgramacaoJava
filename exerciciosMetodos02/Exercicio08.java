package exerciciosMetodos02;

import java.util.Scanner;

//Crie um método chamado CalcularFatorial que receba um inteiro positivo como parâmetro e retorne o fatorial desse número. 

public class Exercicio08 {
	static int CalcularFatorial(int a) {
		int resultado = a;
		for(int i = a-1; i > 0; i--) {
			resultado *= i; 
		}
		return resultado;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor e veja seu fatorial: ");
		int valor = sc.nextInt();
		System.out.println(valor+"! = "+CalcularFatorial(valor));
		sc.close();
	}
}
