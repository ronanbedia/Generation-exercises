package exCondicionais;

import java.util.Scanner;

public class ex1LacosDec {

	public static void main(String[] args) {
		
		double n1, n2, n3, maior;
		maior = 0;	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = leia.nextDouble();
				
		System.out.println("Digite o 2� n�mero: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = leia.nextDouble();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero �: " + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero �: " + n2);
		}
		else if(n3 > n2 && n3 > n1) {
			System.out.println("O maior n�mero �: " + n3);
		}
		
		
		leia.close();
	}
		

}
