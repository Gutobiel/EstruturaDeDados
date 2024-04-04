package NO;

public class No {
	//Propriedades da classe
	private int Numero = 0;
	private No Proximo = null;
	
	//GET E SET
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		this.Numero = numero;
	}
	public No getProximo() {
		return Proximo;
	}
	public void setProximo(No proximo) {
		this.Proximo = proximo;
	}
	
	//metodo construtor cheio
	public No(int numero, No proximo) {
		super();
		this.Numero = numero;
		this.Proximo = proximo;
	}
	//VAZIO
	public No() {
		super();
	}
	
}
