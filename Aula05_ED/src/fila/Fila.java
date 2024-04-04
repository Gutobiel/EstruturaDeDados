package fila;

import NO.No;

public class Fila {
	private No cabeca = null;
	
	public void Entrar(int numero) {
		No novoNo = new No(numero, null);
		
		if (cabeca == null) {
			cabeca = novoNo;
			return;
		}
		// cenario dificil: a fila nao esta vazia
				No ponteiro = cabeca;
				
				while (ponteiro.getProximo() != null) {
					ponteiro = ponteiro.getProximo();
				}
				
				ponteiro.setProximo(novoNo);
			}
			
			public void Sair() {
				if (cabeca == null) {
					return;
				}
			
			System.out.println(cabeca.getNumero());
			cabeca = cabeca.getProximo();
	}
}
