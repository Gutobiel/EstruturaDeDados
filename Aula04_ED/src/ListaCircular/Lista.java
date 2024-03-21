package ListaCircular;

public class Lista {

	private No cabeca = null;
	
	public void imprimir() {
		No ponteiro = cabeca;
		boolean flag = true;
		
		if (cabeca != null) {
			
			while(flag) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
			
			flag = (ponteiro != cabeca);
			}
		}
	}
	public void inserir(int numero) {
		//Criando do novo Nó
		No novoNo = new No(numero, null);
		//Inserção do novo nó na lista
		if (cabeca == null) {
			cabeca = novoNo;
			novoNo.setProximo(cabeca);
		} else {
			No ponteiro = cabeca;
			
			while (ponteiro.getProximo() != cabeca) {
				ponteiro = ponteiro.getProximo();
			}
			ponteiro.setProximo(novoNo);
			novoNo.setProximo(cabeca);
		}
	}
	public void remover(int numero) {
		No ponteiro = cabeca;
		
		if (cabeca != null) {
			if (cabeca.getNumero() == numero) {
				//Excluir o primeiro nó da lista
				while (ponteiro.getProximo() != cabeca) {
					ponteiro = ponteiro.getProximo();				
					}
			}
			if (cabeca == cabeca.getProximo()) {
				cabeca = null;
			} else {
			cabeca = cabeca.getProximo();
			ponteiro.setProximo(cabeca);
			}
		} else {
			//Excluir um nó no meio da lista
			while ((ponteiro.getProximo() != cabeca)&& (ponteiro.getProximo().getNumero() != numero)) {
				ponteiro = ponteiro.getProximo();
			}
			if ((ponteiro.getProximo()!= cabeca)) {
				ponteiro.setProximo(
				ponteiro.getProximo().getProximo());
				
			}
		}
	}
}
