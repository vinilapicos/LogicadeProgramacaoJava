package exerciciosMetodos02;

//Crie um método chamado CalcularMedia que receba três números decimais como parâmetros e retorne a média desses números. 

import java.util.Scanner;

public class Exercicio10 {
	static float CalcularMedia(float a, float b, float c) {
		float media = (a+b+c)/3;
		return media;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		float valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		float valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
		float valor3 = sc.nextInt();
		System.out.println("A média dos valores é "+CalcularMedia(valor1, valor2,valor3));
		sc.close();
	}
}
