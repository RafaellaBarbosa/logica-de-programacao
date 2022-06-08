package ListaDois;

import java.util.Scanner;

public class QuestaoSeis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite Número 1");
		int numeroUm = scan.nextInt();
		System.out.println("Digite Número 2");
		int numeroDois = scan.nextInt();
		System.out.println("Digite Número 3");
		int numeroTres = scan.nextInt();
		if ((numeroUm >= numeroDois && numeroDois >= numeroTres)
				|| (numeroUm <= numeroDois && numeroDois <= numeroTres)) {
			System.out.println("Números ordenados");		

		}
	}
}