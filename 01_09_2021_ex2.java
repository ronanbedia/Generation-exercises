package exCondicionais;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
	double n1, n2, n3;
		
	Scanner leia = new Scanner(System.in);
		
	System.out.println("Digite o primeiro número: ");
		n1 = leia.nextDouble();
		
	System.out.println("Digite o segundo número: ");
		n2 = leia.nextDouble();
		
	System.out.println("Digite o terceiro número: ");
		n3 = leia.nextDouble();
		
	if (n1 < n2 && n2 < n3) {
		System.out.println("A ordem é: " + n1+ ", " + n2+ ", " + n3);
		}
	else if (n2 < n3 && n3 < n1) {
		System.out.println("A ordem é: " + n2+ ", " + n3+ ", " + n1);
		}
	else if (n1 < n3 && n3 < n2) {
		System.out.println("A ordem é: " + n1+ ", " + n3+ ", " + n2);
		}
	else if (n1 < n2 && n2 < n3) {
		System.out.println("A ordem é: " + n1+ ", " + n2+ ", " + n3);
		}
	else if (n3 < n2 && n2 < n1) {
		System.out.println("A ordem é: " + n3+ ", " + n2+ ", " + n1);
		}
	else if (n3 < n1 && n1 < n2) {
		System.out.println("A ordem é: " + n3 + ", " + n1 + ", " + n2);
		}
	}

}
