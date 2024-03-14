public class No {
	//Propriedades da classe
	private int numero = 0;
	private No proximo = null;
	
	//Getters and setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	// Métodos construtores da classe
	// Vazio
	public No() {
		super();
	}
	
	//Cheio
	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}

	
}
