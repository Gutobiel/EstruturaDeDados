
public class Arvore {
	//Propriedades da classe
	
	private No raiz = null;
	
	//METODOS DA CLASSE
	public void inserir(int numero) {
		raiz = inserir (raiz,numero);
	}
	private No inserir(No raiz, int numero) {
		
		//Caso facil
		if(raiz == null) {
			raiz = new No(numero, null, null);
			return raiz;
		}
		//Caso dificil, árvore não vazia
		int sorteio = ((int) (2 * Math.random()));
		if (sorteio == 0) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(),numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(),numero));
		}
		return raiz;
	}
	
	public void navegarPreOrdem() {
		System.out.println("Navegação Pré-ordem");
		navegarPreOrdem(raiz);
		System.out.println();
	}
	private void navegarPreOrdem(No raiz){
		if(raiz == null) {
			return;
		}
		System.out.print(raiz.getNumero() + ",");
		navegarPreOrdem(raiz.getEsquerda());
		navegarPreOrdem(raiz.getDireita());
	}
	
	//===========//
	public void navegarEmOrdem() {
		System.out.println("Navegação Em-ordem");
		navegarEmOrdem(raiz);
		System.out.println();
	}
	private void navegarEmOrdem(No raiz){
		if(raiz == null) {
			return;
		}
		navegarEmOrdem(raiz.getEsquerda());
		System.out.print(raiz.getNumero() + ",");
		navegarEmOrdem(raiz.getDireita());
	}
	
	//===========//
	public void navegarPosOrdem() {
		System.out.println("Navegação Pós-ordem");
		navegarPosOrdem(raiz);
		System.out.println();
	}
	private void navegarPosOrdem(No raiz){
		if(raiz == null) {
			return;
		}
		navegarPosOrdem(raiz.getEsquerda());
		navegarPosOrdem(raiz.getDireita());
		System.out.print(raiz.getNumero() + ",");
	}
	
	// Função para desenhar a árvore
	public void desenharArvore() {
	    System.out.println("Árvore Binária:");
	    desenharArvore(raiz, 0);
	}

	private void desenharArvore(No raiz, int nivel) {
	    if (raiz == null) {
	        return;
	    }
	    desenharArvore(raiz.getEsquerda(), nivel + 1);
	    for (int i = 0; i < nivel; i++) {
	        System.out.print("    ");
	    }
	    System.out.println(raiz.getNumero());
	    desenharArvore(raiz.getDireita(), nivel + 1);
	}
}

