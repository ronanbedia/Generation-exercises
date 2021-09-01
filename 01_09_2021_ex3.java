package exCondicionais;

import java.util.Scanner;

public class ex2_01_09_2021 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	
	double infantil, juvenil, adulto, idade;
	
	System.out.println("Digite a sua idade atual: ");
	idade = leia.nextDouble();
	
	
	
	System.out.println("Você se encontra na categoria: ");
	
	if(idade > 18 && idade <= 25) {
		System.out.println("Adulto(a).");
	}
	else if (idade >= 10 && idade < 15) {
		System.out.println("Infantil");
	}
	else if (idade >= 15 && idade < 18) {
		System.out.println("Juvenil.");
	}
	else if (idade > 30.0) {
		System.out.println("Adulto(a).");
	}
	leia.close();
	
	}
}
	