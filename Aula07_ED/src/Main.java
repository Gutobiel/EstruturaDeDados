
public class Main {
	public static void main(String[] args) {
		//Drclaração de variáveis
		Deque objDeque = new Deque();
		
		//Teste de atendimento com filas vazias
		objDeque.atender();
		
		//Teste de 5 nós na fila normal
		for (int i=0 ; i < 5 ; i++) {
			objDeque.entrar(i, false);
		}
		for (int i=0 ; i < 6 ; i++) {
			objDeque.atender();
		}
		for (int i=0 ; i < 5 ; i++) {
			objDeque.entrar(i, true);
		}
		for (int i=0 ; i < 6 ; i++) {
			objDeque.atender();
		}
	}
}

