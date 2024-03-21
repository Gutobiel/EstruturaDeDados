package ListaDupla;

public class Main {
	public static void main(String[] args) {
		
		Lista objLista = new Lista();
		
		for (int i = 0; i <= 10; i++) {
			objLista.inserir(i);
		}
		objLista.imprimir();
			
		System.out.println("Lista original");
		objLista.inserir(1);
		objLista.inserir(2);
		objLista.inserir(3);
		objLista.inserir(4);
		
		objLista.imprimir();
		System.out.println("Lista modificada");
		
		objLista.remover(1);
		objLista.remover(2);
		objLista.remover(3);
		objLista.remover(100);
		
		objLista.imprimir();
	}
}
