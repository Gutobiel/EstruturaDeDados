import java.util.Scanner;

public class TransposicaoMatriz {
	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[][] matriz = new int[2][3];
		int[][] matrizTransposta = new int[3][2];
		
		// Entrada de dados
		for (int i = 0 ; i < 2 ; i++) { //Linhas
			for (int j = 0 ; j < 3 ; j++) { //Colunas
				System.out.print("matriz["+ i + "," + j + "]: ");
				matriz[i][j] = leitor.nextInt();
			}
		}
		leitor.close();
		
		//Processamento
		for (int i = 0 ; i < 2 ; i++) { //Linhas
			for (int j = 0 ; j < 3 ; j++) { //Colunas
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		
		//Saída de dados
		for (int i = 0 ; i < 2 ; i++) { //Linhas
			for (int j = 0 ; j < 3 ; j++) { //Colunas
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0 ; i < 3 ; i++) { //Linhas
			for (int j = 0 ; j < 2 ; j++) { //Colunas
				System.out.print(matrizTransposta[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
