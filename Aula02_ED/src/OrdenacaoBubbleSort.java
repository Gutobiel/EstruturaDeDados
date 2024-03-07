import java.util.Scanner;

public class OrdenacaoBubbleSort {
	public static void main(String[] args) {
		//Declaração de variaveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		boolean troquei = true;
		
		//Preenchimento do vetor
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Vetor[" + i + "]: ");
			vetor[i] = leitor.nextInt();
		}
		leitor.close();
		
		//Ordenação proprimanete dita
		while (troquei) {
			troquei = false;
			for (int i = 0 ; i < 9 ; i++) { //Do primeiro ao ultimo
				if(vetor[i] > vetor[i + 1]) {
					int temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					troquei = true;
				}
			}
		}
		//Impresão na tela do vetor
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(vetor[i]);
		}
	}
}
