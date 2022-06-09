package ListaDois;

import java.util.Scanner;

public class QuestaoNove {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite Número 1");
		double numeroUm = scan.nextDouble();
		System.out.println("Digite Número 2");
		double numeroDois = scan.nextDouble();
		System.out.println("Digite Número 3");
		double numeroTres = scan.nextDouble();
		System.out.println("Digite Número 4");
		double numeroQuatro = scan.nextDouble();
		
		double media = (numeroUm + numeroDois + numeroTres + numeroQuatro) / 4;
		String notas = "";
		
		if (numeroUm > media) {
			notas = notas + numeroUm + " ";
		}
		if (numeroDois > media) {
			notas = notas + numeroDois + " ";
		}
		if (numeroTres > media) {
			notas = notas + numeroTres + " ";
		}
		if (numeroQuatro > media) {
			notas = notas + numeroQuatro + " ";
		}
		System.out.println(notas);
				
	}
}