package teste1;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, diasTotais;
		
		System.out.println("Digite na ordem pedida a sua idade separada em anos, meses e dias:");
		
		System.out.println("Quantos anos completos você tem? ");
		anos = leia.nextInt();

		System.out.println("quantos meses? ");
		meses = leia.nextInt();

		System.out.println("e quantos dias? ");
		dias = leia.nextInt();

		diasTotais = ((anos*365) + (meses*30) + dias);

		System.out.println("Você tem " + diasTotais + " dias de vida");

	}

}
