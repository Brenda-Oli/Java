import java.util.Scanner;

public class BoletimEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variáveis
		String nome[] = new String[5];
		float notas[][] = new float[5][4];
		float media[] = new float[5];
		String status[] = new String[5];
		
		Scanner entrada = new Scanner(System.in);

		// Laço de repetição para os nomes dos alunos
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do(a) " + (i+1) + " aluno(a):");
			nome[i] = entrada.next();

			// Laço de repetição para as notas
			for(int j = 0; j < 4; j++) {
				System.out.println("Digite a " + (j+1) + "° nota do aluno(a) " + nome[i]);
				notas[i][j] = entrada.nextInt();
			}
		}
		
		// Laço de repetição para calcular a média
		for(int i=0; i<5; i++){
			
			for(int j=0; j<4 ; j++){
				media[i]=media[i]+notas[i][j];
			}
			
			media[i]=media[i]/4;
			
			if(media[i] >= 7){
				status[i]= "Aprovado";
			}
			else if(media[i]<7 && media[i]>5)
				status[i]="Recuperação";
			else
				status[i]="Retido";
		}
		
		// Laço de repetição para mostrar o boletim
		System.out.println("\n- Boletim Escolar -");
		for(int i=0; i<5; i++){
			System.out.println("\nAluno: " + nome[i]);
			
			for(int j=0; j<4; j++){
				System.out.println((j+1) + "° nota: " + notas[i][j]);
			}
			
			System.out.println("\nMédia: " + media[i]);
			System.out.println("Status: " + status[i]);
			System.out.println("_________________________");
		}
	}

}
