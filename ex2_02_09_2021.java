package projetoNovo;

import java.util.Scanner;

public class ex2_02_09_2021 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, contador, par = 0, impar = 0 ;
		
		for (contador = 0; contador < 10; contador++) {
			
			System.out.println("Digite o n�mero: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		
		}
		System.out.println("Foram " + par + " n�meros pares e " + impar + " n�meros �mpares.");
		leia.close();
	}

}
