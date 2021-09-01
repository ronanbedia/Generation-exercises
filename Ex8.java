package teste1;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double consumidor, fabrica, distribuidor, impostos;

		System.out.println("Qual o custo de fábrica do carro? ");
		fabrica = leia.nextDouble();
		
		distribuidor = fabrica*0.28;
		
		impostos = fabrica*0.45;
		
		consumidor = (fabrica + impostos + distribuidor);

		System.out.println("O custo final do carro para o consumidor será de " + consumidor + " reais.");

		
		
	}

}
