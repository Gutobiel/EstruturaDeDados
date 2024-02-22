import java.util.Scanner;

public class MultiplicarMatriz {
	public static void main(String[] args) {
		
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[][] operando1 = new int[2][3];
		int[][] operando2 = new int[3][2];
		int[][] resultado = new int[2][2];
		
		//Entrada de dados
		for (int i = 0 ; i < 2 ; i++) { //Linhas
			for (int j = 0 ; j < 3 ; j++) { //Colunas
				System.out.print("operando1["+ i + "," + j + "]: ");
				operando1[i][j] = leitor.nextInt();
			}
		}
		
		for (int i = 0 ; i < 3 ; i++) { //Linhas
			for (int j = 0 ; j < 2 ; j++) { //Colunas
				System.out.print("operando2["+ i + "," + j + "]: ");
				operando2[i][j] = leitor.nextInt();
			}
		}
		leitor.close();
		
		//Processamento
		for (int i = 0 ; i < 2 ; i++) { 
			for (int j = 0 ; j < 2 ; j++) {
				for (int k = 0 ; k < 3 ; k++) {
					resultado[i][j] += (operando1[i][k] * operando2[k][j]);
				}
			}
		}
		//Saída de dados
				for (int i = 0 ; i < 2 ; i++) { //Linhas
					for (int j = 0 ; j < 2 ; j++) { //Colunas
						System.out.print(resultado[i][j] + "\t");
					}
					System.out.println();
				}
			}
		}
