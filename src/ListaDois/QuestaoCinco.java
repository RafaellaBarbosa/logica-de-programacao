package ListaDois;

import java.util.Scanner;

public class QuestaoCinco {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua Altuta");
		double altura = scan.nextDouble();
		System.out.println("Digite sua Idade");
		int idade = scan.nextInt();
		if (idade >= 14 && idade <= 18 && altura >= 1.78) {
			System.out.println("Selecioado");	
		}			
	}

}
