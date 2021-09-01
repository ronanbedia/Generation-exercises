package exCondicionais;

import java.util.Scanner;

public class ex1LacosDec {

	public static void main(String[] args) {
		
		double n1, n2, n3, maior;
		maior = 0;	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextDouble();
				
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o 3º número: ");
		n3 = leia.nextDouble();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: " + n2);
		}
		else if(n3 > n2 && n3 > n1) {
			System.out.println("O maior número é: " + n3);
		}
		
		
		leia.close();
	}
		

}
