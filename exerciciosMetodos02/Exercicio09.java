package exerciciosMetodos02;

import java.util.Scanner;

//Crie um método chamado ConcatenarStrings que receba duas strings como parâmetros e retorne a concatenação dessas duas strings.

public class Exercicio09 {
	static String ConcatenarString(String a, String b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira mensagem: ");
		String mensagem1 = sc.nextLine();
		System.out.println("Digite a segunda mensagem e veja sua concatenação: ");
		String mensagem2 = sc.nextLine();
		System.out.println(ConcatenarString(mensagem1, mensagem2));
		sc.close();
	}
}
