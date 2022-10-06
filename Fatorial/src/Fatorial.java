import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variáveis
		int n, i, res = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		// Apresentação e entrada de dados
		System.out.println("- Fatorial -");
		System.out.print("Digite o número que deseja fatorar: ");
		n = entrada.nextInt();
		
		System.out.println("\nResultado:");
		
		if(n == 0) {
			System.out.println(n + "! = " + "1");
		}
		else if(n == 1) {
			System.out.println(n + "! = " + "1");
		}
		else {
			System.out.print(n + "! = ");
			
			for(i = n; i > 1; i--) {
				res *= i;
				System.out.print(i + " x ");
			}
			System.out.println("1 = " + res);
		}
		
	}

}
