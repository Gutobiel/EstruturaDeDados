
public class No {
	private int numero = 0;
	private No proximo = null;
	
	
	public No() {
		super();
	}
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
	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}

}
