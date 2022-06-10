package ListaTres;

import java.util.Scanner;

public class QuestaoDois {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Número 1");
		double numeroUm = scan.nextDouble();
		System.out.println("Digite o Número 2");
		double numeroDois = scan.nextDouble();
		if (numeroUm > numeroDois) {
			System.out.println(numeroUm + "maior que" + numeroDois);
		} else  if(numeroUm < numeroDois) {
			System.out.println(numeroUm + "menor que" + numeroDois);
		} else  {
			System.out.println("números iguais");
		}

	}

}
