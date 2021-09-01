package exCondicionais;

import java.util.Scanner;

public class ex4_01_09_2021 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um numero inteiro: ");
		num = leia.nextInt();
		
		if (num % 2 ==0) {
			System.out.println("Par..............");
			raiz = Math.sqrt(num);
			
			System.out.println("Raiz quadrada: " + raiz);
			System.out.println("Raiz quadrada: " + Math.sqrt(num));
		}
		else if(num % 2 == 1) {
			System.out.println("Ímpar............");
			elevado = Math.pow(num, 2);
			
			System.out.println("Potência: " + elevado);
		}
		leia.close();

	}

}
