package ListaDois;

import java.util.Scanner;

public class QuestaoDez {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite número 1");
		double numeroUm = scan.nextDouble();
		System.out.println("Digite número 2");
		double numeroDois = scan.nextDouble();
		System.out.println("Digite número 3");
		double numeroTres = scan.nextDouble();

		if (numeroUm > numeroDois && numeroUm > numeroTres) {
			System.out.println(numeroUm + " é o maior");
			if (numeroDois > numeroTres) {
				System.out.println(numeroTres + " é o menor ");
			} else {
				System.out.println(numeroDois + " é o menor");
			}
		}
		if (numeroDois > numeroUm && numeroDois > numeroTres) {
			System.out.println(numeroDois + " é o maior");
			if (numeroUm > numeroTres) {
				System.out.println(numeroTres + "é o menor");

			} else {
				System.out.println(numeroUm + " é o menor");
			}
		}
		if (numeroTres > numeroUm && numeroTres > numeroDois) {
			System.out.println(numeroTres + " é o maior");
			if (numeroDois > numeroUm) {
				System.out.println(numeroUm + " é o menor");
			} else {
				System.out.println(numeroDois + "é o menor");
			}
		}

	}

}
