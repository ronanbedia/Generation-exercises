package projetoNovo;

import java.util.Scanner;

public class ex3_02_09_2021 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, velho = 0, novo = 0;
		
		
		
		while(idade != -99) {
			
			System.out.println("digite a sua idade: (digite -99 para sair) ");
			idade = leia.nextInt();
			if (idade < 21) {
				novo++;
			}
			else if (idade > 50) {
				velho++;
			}
			
		}
		System.out.println("O número de pessoas com menos de 21 anos é " + (novo - 1) + " e o de pessoas com mais de 50 anos é " + velho);	
		leia.close();
		
		
	}
	
	

}
