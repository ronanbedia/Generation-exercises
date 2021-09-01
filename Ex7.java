package teste1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, E, F, x, y;

		System.out.println("Digite aqui o valor de A: ");
		A = leia.nextDouble();
		
		System.out.println("Digite aqui o valor de B: ");
		B = leia.nextDouble();
		
		System.out.println("Digite aqui o valor de C: ");
		C = leia.nextDouble();
		
		System.out.println("Digite aqui o valor de D: ");
		D = leia.nextDouble();
		
		System.out.println("Digite aqui o valor de E: ");
		E = leia.nextDouble();
		
		System.out.println("Digite aqui o valor de F: ");
		F = leia.nextDouble();

		x = (C*E - B*F)/(A*E - B*D);

		y = (A*F - C*D)/(A*E - B*D);

		System.out.println("O valores são X = " + x + " e Y = " + y);

	}

}
