
public class Lista {
	
	//Propriedades da classe
	private No cabeca = null; //"Ponteiro"
	
	//Metodos da classe
	public void apresentar() {
		No ponteiro = cabeca;
		while (ponteiro!= null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
	public void inserir(int numero) {
		//Criar um novo no
		No novoNo = new No(numero, null);
		if (cabeca == null) {
			cabeca = novoNo;
		} else {
			//Cenário difícil, a lista Não esta vazia
			No ponteiro = cabeca;
			
			//Navega a lista até chagar ao ultimo nó
			while(ponteiro.getProximo() != null) {
				ponteiro = ponteiro.getProximo();			
		}

				//Aponta o ultimo nó da lista para novo nó
				ponteiro.setProximo(novoNo);
		}
	}
	public void excluir(int numero) {
		if (cabeca != null) { //Cenario obvio
			if (cabeca.getNumero() == numero){
				cabeca = cabeca.getProximo();
				} else {
				//Cenario dificil
				No ponteiro = cabeca;
				
				//Procurar ate encontrar o numero ou chegar no final
				while((ponteiro.getProximo() != null) &&
					  (ponteiro.getProximo().getNumero() != numero)); {
					   ponteiro = ponteiro.getProximo();
				}
					  //Excluir se nao estiver no final
					if (ponteiro.getProximo() != null) {
						ponteiro.setProximo(ponteiro.getProximo().getProximo());
					}
			}
		}
	}
}
