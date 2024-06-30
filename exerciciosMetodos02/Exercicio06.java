package exerciciosMetodos02;

import java.util.Scanner;

public class Exercicio06 {
	static boolean EhPar(int a, boolean par) {
		if (a % 2 == 0){
			par = true;
			return par;
		} else {
			return par;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor e verifique se ele é par: ");
		int valor1 = sc.nextInt();
		boolean par = false;
		System.out.println(EhPar(valor1, par));
		sc.close();
	}
}
