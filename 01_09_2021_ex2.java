package exCondicionais;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
	double n1, n2, n3;
		
	Scanner leia = new Scanner(System.in);
		
	System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextDouble();
		
	System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextDouble();
		
	System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextDouble();
		
	if (n1 < n2 && n2 < n3) {
		System.out.println("A ordem �: " + n1+ ", " + n2+ ", " + n3);
		}
	else if (n2 < n3 && n3 < n1) {
		System.out.println("A ordem �: " + n2+ ", " + n3+ ", " + n1);
		}
	else if (n1 < n3 && n3 < n2) {
		System.out.println("A ordem �: " + n1+ ", " + n3+ ", " + n2);
		}
	else if (n1 < n2 && n2 < n3) {
		System.out.println("A ordem �: " + n1+ ", " + n2+ ", " + n3);
		}
	else if (n3 < n2 && n2 < n1) {
		System.out.println("A ordem �: " + n3+ ", " + n2+ ", " + n1);
		}
	else if (n3 < n1 && n1 < n2) {
		System.out.println("A ordem �: " + n3 + ", " + n1 + ", " + n2);
		}
	}

}
