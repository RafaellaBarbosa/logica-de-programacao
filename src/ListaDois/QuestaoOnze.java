package ListaDois;

import java.util.Scanner;

public class QuestaoOnze {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite nota 1");
		double notaUm = scan.nextDouble();
		System.out.println("Digite nota 2");
		double notaDois = scan.nextDouble();
		System.out.println("Digite nota 3");
		double notaTres = scan.nextDouble();
		double soma = 0;
		if (notaUm < notaDois && notaUm < notaTres) {
			soma = notaDois + notaTres;
		} else if (notaDois < notaUm && notaDois < notaTres) {
			soma = notaUm + notaTres;
		} else {
			soma = notaUm + notaDois;
		}
		double media = soma / 2;
		if (media >= 8) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		} 
	}
}
