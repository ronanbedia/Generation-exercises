package teste1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas, segundosTotais;

		System.out.println("Quantos segundos o evento durou na fábrica? ");
		segundosTotais = leia.nextInt();

		horas = segundosTotais/3600;
		
		minutos = ((segundosTotais%3600)/60);
		
		segundos = ((segundosTotais%3600)%60);
		

		System.out.println("O tempo de evento foi de " + horas + " horas " + minutos + " minutos " + segundos + " segundos");

	}

}
