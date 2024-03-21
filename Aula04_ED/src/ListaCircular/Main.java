package ListaCircular;

public class Main {
	public static void main(String[] args) {
		
		Lista objLista = new Lista();
		System.out.println("Lista original");
		objLista.inserir(1);
		objLista.imprimir();
		System.out.println("Lista modificada");
		

		
		objLista.imprimir();
	}
}
