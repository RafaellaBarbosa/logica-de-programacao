package ListaDois;

import java.util.Scanner;

public class QuestaoUm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um Número");
		int numero = scan.nextInt();
		if (numero % 2 == 0) {
			System.out.println("Número par");
		}
	
	}

}
