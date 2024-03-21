package ListaCircular;

public class No {
	//Propriedades da classe
	private int numero = 0;
	private No proximo = null;
	//Metodo construtor vazio
	public No() {
		super();
	}
//metodo construtor cheio
	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}
//GET E SET
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
	
}
