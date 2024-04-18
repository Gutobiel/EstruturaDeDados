
public class Deque {
	
	//Propriedades da classe
	private No filaNormal = null;
	private No filaPreferencial = null;
	private int flagAtendimentoPreferencial = 3;
	
	//Metodos da classe
	public void entrar(int numero, boolean normal) {
		if (normal) {
		No novoNo = new No(numero, filaNormal);
		filaNormal = novoNo;
		} else {
			No novoNo = new No(numero, filaPreferencial);
			filaPreferencial = novoNo;
		}
	}
	
	private No removerNoDaFila (String tipo,No fila) {
		//Cenario muito fácil, fila vazia
		if (fila == null) {
			return null;
		}
		//Cenário facil, fila so te m1 nó
		if (fila.getProximo() == null) {
			System.out.println(tipo+fila.getNumero());
			fila = null;
			return null;
		}
		//Cenário dificil, a fila tem varios nós
		No ponteiro = fila;
		while (ponteiro.getProximo().getProximo() != null) {
			ponteiro = ponteiro.getProximo();
		}
		System.out.println(tipo+ponteiro.getProximo().getNumero());
		ponteiro.setProximo(null);
		return fila;
	}
	
	public void atender() {
		if ((flagAtendimentoPreferencial > 0) && (filaPreferencial != null)) {
			filaPreferencial = removerNoDaFila("(P)", filaPreferencial);
			if (filaNormal != null){
				flagAtendimentoPreferencial--;
			} 
		}else if (filaNormal != null) {
			filaNormal = removerNoDaFila("", filaNormal);
			flagAtendimentoPreferencial = 3;
		} else {				
			System.out.println("Filas estão vazias!");
		}
	}
}
