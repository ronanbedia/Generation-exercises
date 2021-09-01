package teste1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;

		System.out.println("Digite a Nota da avaliação 1: ");
		nota1 = leia.nextDouble();

		System.out.println("Digite a Nota da avaliação 2: ");
		nota2 = leia.nextDouble();

		System.out.println("Digite a Nota da avaliação 3: ");
		nota3 = leia.nextDouble();

		media = (nota1*0.2 + nota2*0.3 + nota3*0.5);

		System.out.println("Sua média ponderada é: " + media);

	}

}
