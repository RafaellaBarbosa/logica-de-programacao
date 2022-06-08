package ListaDois;

import java.util.Scanner;

public class QuestaoTres {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu peso");
		int peso = scan.nextInt();
		
		System.out.println("Digite sua Altura");
		double altura = scan.nextDouble();
		
		double imc = peso / (altura * altura);
		//double imc = peso / Math.pow(altura, 2);
		if (imc > 25) {
			System.out.println("Acima do Peso");
		}

	}
	
	
}
