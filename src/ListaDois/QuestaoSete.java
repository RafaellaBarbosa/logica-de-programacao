package ListaDois;

import java.util.Scanner;

public class QuestaoSete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite lado 1");
		int ladoUm = scan.nextInt();
		System.out.println("Digite lado 2");
		int ladoDois = scan.nextInt();
		System.out.println("Digite lado 3");
		int ladoTres = scan.nextShort();
		if (ladoUm < ladoDois + ladoTres && ladoDois < ladoTres + ladoUm && ladoTres < ladoDois + ladoUm) {
			System.out.println("Triangulo");
		}

	}

}
