package ListaDois;

import java.util.Scanner;

public class QuestaoQuatro {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade" );
		int idade = scan.nextInt();
		System.out.println("Digite sua altura" );
		double altura = scan.nextDouble();
		if (!(idade <= 16 && altura >= 1.7)) {
			System.out.println("Fora da Categoria A");
		}  
	}
				
		
}
