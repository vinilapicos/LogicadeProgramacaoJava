package exerciciosMetodos02;
import java.util.Calendar;
//Crie um método chamado ObterDataAtual que não receba parâmetros e retorne a data atual como uma string no formato "dd/MM/yyyy"

public class Exercicio07 {
	static String ObterDataAtual() {
		Calendar c = Calendar.getInstance();
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes = c.get(Calendar.MONTH)+1;
		int ano = c.get(Calendar.YEAR);
		String data = dia+"/"+mes+"/"+ano;
		return data;
	}
	public static void main(String[] args) {
		System.out.println("A data de hoje é "+ObterDataAtual());
	}
}
