package teste1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int diasVividos, meses, anos, dias;

		System.out.println("Quantos dias de vida você já teve o privilégio de viver? ");
		diasVividos = leia.nextInt();

		anos = (diasVividos/365);
		
		meses = ((diasVividos%365)/30);
		
		dias = ((diasVividos%365)%30);


		System.out.println("Você já viveu um total de " + anos + " anos, " + meses + " meses e " + dias + " dias!");

	}

}
