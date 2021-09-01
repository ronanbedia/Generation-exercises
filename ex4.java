package teste1;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c;

		System.out.println("Digite o Número inteiro e positivo relacionado a letra A: ");
		a = leia.nextInt();

		System.out.println("Digite o Número inteiro e positivo relacionado a letra B: ");
		b = leia.nextInt();

		System.out.println("Digite o Número inteiro e positivo relacionado a letra C: ");
		c = leia.nextInt();

		double R = Math.pow(a+b, 2);

		double S = Math.pow(b+c, 2);
		
		double resultado = (R + S)/2;

		System.out.println("seu resultado é: " + resultado);


	}

}
