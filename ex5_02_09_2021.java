package gen.cond.ex;

import java.util.Scanner;

public class ex5_02_09_2021 {

	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite o número: ");
			num = leia.nextInt();
			
			soma += num;
			
		}while (num != 0);
		
		System.out.println("A soma dos números é de: " + soma);
	}

}
