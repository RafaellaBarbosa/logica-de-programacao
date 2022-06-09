package ListaDois;

import java.util.Scanner;

public class QuestaoDoze {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um Número");
		int numero = scan.nextInt();
		int parteUm = numero / 100;
		int parteDois = numero % 100;
		int soma = parteUm + parteDois;
		if (soma * soma == numero) {
			System.out.println(numero + " Está na categoria");
		}
	}
}
