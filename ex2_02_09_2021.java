package projetoNovo;

import java.util.Scanner;

public class ex2_02_09_2021 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, contador, par = 0, impar = 0 ;
		
		for (contador = 0; contador < 10; contador++) {
			
			System.out.println("Digite o número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		
		}
		System.out.println("Foram " + par + " números pares e " + impar + " números ímpares.");
		leia.close();
	}

}
