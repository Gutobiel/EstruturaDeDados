
public class Principal {
	public static void main(String[] args) {
		Arvore objArvore = new Arvore();
		
		for(int i = 0; i < 20; i++) {
			objArvore.inserir(i);
		}
		
		objArvore.imprimir();
	}
}
