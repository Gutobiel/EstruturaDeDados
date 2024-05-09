import java.util.Scanner;

public class Main {
	private static final int TAMANHO = 1000;
	public static void main(String[] args) {
		
		//Declaração das variáveis
		TreeSearch objArvore = new TreeSearch();
		Scanner leitor = new Scanner(System.in);
		int busca = 0;
		
		//Construção das arvores
		for (int i = 0 ; i < TAMANHO; i++) {
			objArvore.inserir((int) (TAMANHO * Math.random()));
		}
		
		//Buscas ca arvore
		do {
			System.out.println("Digite um numero a ser buscado, " + "ou -1 para sair: ");
			busca = leitor.nextInt();
			objArvore.buscar(busca);
		} while (busca != -1);
		leitor.close();
		
		
		//Impressao da arvore
		objArvore.imprimir();
		//Navegação da árvore
		objArvore.navegarEmOrdem();
	}
}
