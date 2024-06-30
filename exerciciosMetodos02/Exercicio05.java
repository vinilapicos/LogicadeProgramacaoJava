package exerciciosMetodos02;

import java.util.Scanner;

//Crie um método chamado MaiorNumero que receba dois inteiros como parâmetros e retorne o maior entre eles. 

public class Exercicio05 {
	static int MaiorNumero(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int valor2 = sc.nextInt();
		System.out.println("O maior número é o "+MaiorNumero(valor1, valor2));
		sc.close();
	}
}