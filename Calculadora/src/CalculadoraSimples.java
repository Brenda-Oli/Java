import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaração de variáveis
		int n1, n2, s1, s2, m1, m2, d1, d2, total, op;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			// Apresentação do sistema
			System.out.println("\n\n - Calculadora -\n");
			
			// Menu
			System.out.println("1. Soma");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			System.out.println("5. Sair \n");
			
			// Opção do usuário
			System.out.print("Opção:");
			op = entrada.nextInt();
			
			if(op == 1) {
				// Apresentação Soma
				System.out.println("\n- Soma -");
				// Entradas
				System.out.print("Digite o primeiro número:");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo número:");
				n2 = entrada.nextInt();
				// Processamento
				total = n1 + n2;
				// Saída
				System.out.println("\n" + n1 + " + " + n2 + " = " + total);
			}
			else if(op == 2) {
				// Apresentação Subtração
				System.out.println("\n- Subtração -");
				// Entradas
				System.out.print("Digite o primeiro número:");
				s1 = entrada.nextInt();
				System.out.print("Digite o segundo número:");
				s2 = entrada.nextInt();
				// Processamento
				total = s1 - s2;
				// Saída
				System.out.println("\n" +s1 + " - " + s2 + " = " + total);
			}
			else if(op == 3) {
				// Apresentação Multiplicação
				System.out.println("\n- Multiplicação -");
				// Entradas
				System.out.print("Digite o primeiro número:");
				m1 = entrada.nextInt();
				System.out.print("Digite o segundo número:");
				m2 = entrada.nextInt();
				// Processamento
				total = m1 * m2;
				// Saída
				System.out.println("\n" +m1 + " x " + m2 + " = " + total);
			}
			else if(op == 4) {
				// Apresentação Divisão
				System.out.println("\n- Divisão -");
				// Entradas
				System.out.print("Digite o primeiro número:");
				d1 = entrada.nextInt();
				System.out.print("Digite o segundo número:");
				d2 = entrada.nextInt();
				// Processamento
				total = d1 / d2;
				// Saída
				System.out.println("\n" +d1 + " / " + d2 + " = " + total);
			}
			else if(op == 5) {
				// Sair da calculadora
				System.out.println("Calculadora encerrada");
			}
			else {
				// Opção incorreta
				System.out.println("A opção " + op + " está incorreta!");
			}
			
		}
		while(op != 5);
	}

}
