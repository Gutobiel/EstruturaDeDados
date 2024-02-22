import java.util.Scanner;

public class InverterVetor {
	public static void main(String[] args) {
		
		//Declaração de variáveis
				Scanner leitor = new Scanner(System.in);
				
				int[] vetorOriginal = new int[5];
				int[] vetorInvertido = new int[5];
				
				// Entrada de dados
				for (int i = 0 ; i < 5 ; i++) {
					System.out.println("Digite o valor da posição " + i + ": ");
					vetorOriginal[i] = leitor.nextInt();
				}
				
				leitor.close();
				
				// Inverção dos dados
				for (int i = 0 ; i < 5 ; i++) {
					vetorInvertido[4 - i] = vetorOriginal[i];
				}
				
				//Mostrando os valores
				
				System.out.print("Original:");
				for (int i = 0 ; i < 5 ; i++) {
					System.out.print(" " + vetorOriginal[i]);
				}
				
				System.out.print("\tInvertido:");
				for (int i = 0 ; i < 5 ; i++) {
					System.out.print(" " + vetorInvertido[i]);
				}
				
	}
}
