import java.util.Scanner;

public class BuscaExaustiva {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[1000];
		
		int busca = 0;
		int achei = -1;
		
		//Criar o vetor aleatorimente
		for(int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = ((int) (vetor.length * Math.random()));
		}
		
		//Perguntar o parametro de busca
		do {
			achei = -1;
			
			System.out.println("Digite o valor a ser buscado " + "Ou -99 para sair: ");
			
			busca = leitor.nextInt();
			
			//Busca propriamente dita
			for(int i = 0 ; i < vetor.length ; i++) {
				if (vetor[i] == busca) {
					achei = i;
					break;
				}
			}
			if (achei == -1) {
				System.out.println("Me fodi! Não achei");
			}else {
				System.out.println("Achei!!! Na posição " + achei);
			}
		}while (busca != -99);
			leitor.close();
		
	}
}
