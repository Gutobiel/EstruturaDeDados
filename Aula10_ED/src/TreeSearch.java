
public class TreeSearch {
	//P´ropriedades da classe
	private No raiz = null;
	
	//Metodos da classe
	public void inserir(int numero){
		raiz = inserir(raiz, numero);
	}
	private No inserir(No raiz, int numero) {
		
		//Caso extremamente facil
		if (raiz == null) {
			raiz = new No(numero, null, null);
			return raiz;
		}
		
		//Caso dificil a arvore n tá vazia
		if (raiz.getNumero() > numero) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(),numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		return raiz;
	}
	
	public void buscar(int numero) {
		buscar(raiz,numero);
	}
	private void buscar(No raiz, int numero) {
		//Caso extremamente facil
		if (raiz == null) {
			System.out.println("Não achei!\n Arvore vazia");
			return;
		}
		//Caso fácil: o numero está na raiz
		if (raiz.getNumero() == numero) {
		System.out.println("Achei!!!!");
		return;
		}
		//Caso difícil: o número não está na raiz
		if (raiz.getNumero() > numero) {
			buscar(raiz.getEsquerda(), numero);
		} else {
			buscar(raiz.getDireita(), numero);
		}
	}
	public void navegarEmOrdem() {
		navegarEmOrdem(raiz);
	}
	private void navegarEmOrdem(No raiz) {
		if (raiz == null) {
			return;
		}
		
		navegarEmOrdem(raiz.getEsquerda());
		System.out.println(raiz.getNumero());
		navegarEmOrdem(raiz.getDireita());
	}
	public void imprimir() {
		imprimir(raiz, "");
	}
	private void imprimir(No raiz, String indentação) {
		if (raiz != null) {
			System.out.println(indentação + raiz.getNumero());
			imprimir(raiz.getEsquerda(), indentação + "...");
			imprimir(raiz.getDireita(), indentação + "...");
		}
	}
}
