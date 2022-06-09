package ListaDois;

import java.util.Scanner;

public class QuestaoOito {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite numero 1");		
		double numeroUm = scan.nextDouble();
		System.out.println("Digite numero 2");	
		double numeroDois = scan.nextDouble();
		if (numeroUm > numeroDois) {
			System.out.println("O maior número é " + numeroUm);
		}
		else {
			System.out.println("O maior número é " + numeroDois);
		}
	}
		
	
}
