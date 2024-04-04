package pilha;

import NO.No;

public class Pilha {
	
	//Propriedades da classe
	private No cabeca = null;
	
	public void push(int numero) {
		//Criação de novo no
		No novoNo = new No(numero, cabeca);
		
		//Empilhamento propriamente
		cabeca = novoNo;
	}
	
	public void pop() {
		if (cabeca == null) {
			return;
		}
		
		System.out.println(cabeca.getNumero());
		cabeca = cabeca.getProximo();
	}
}
