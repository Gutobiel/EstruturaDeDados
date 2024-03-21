package ListaDupla;

public class Lista {

	private No cabeca = null;
	
	public void imprimir() {
		No ponteiro = cabeca;
		
		while (ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
	
	public void inserir (int numero) {
		//Criação do novo nó
		No novoNo = new No(numero, null, null);
		if (cabeca == null) { // Caso facil: A lista está vazia
			cabeca = novoNo;
		} else { //Caso dificil: A lista NÃO está vazia
			novoNo.setProximo(cabeca);
			cabeca.setAnterior(novoNo);
			cabeca = novoNo;
		}
	}
	public void remover (int numero) {
		No ponteiro = cabeca;
		while ((ponteiro != null) &&
				(ponteiro.getNumero() != numero)) {
			ponteiro = ponteiro.getProximo();
		}
		if (ponteiro != null) {
			if (ponteiro == cabeca) {
				//Caso em que se quer excluir o primeiro nó
				ponteiro.getProximo().setAnterior(null);
				cabeca = ponteiro.getAnterior();
			} else if (ponteiro.getProximo() == null) {
				//Caso em que se quer excluir o ultimo nó
				ponteiro.getAnterior().setProximo(null);
			} else {
				ponteiro.getAnterior().setProximo(ponteiro.getProximo());
				ponteiro.getProximo().setAnterior(ponteiro.getAnterior());
			}
		}
	}
}
