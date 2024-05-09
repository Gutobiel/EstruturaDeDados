import java.math.BigInteger;

public class Principal {
	public static void main(String[] args) {
		Arvore objArvore = new Arvore();

		for (BigInteger i = BigInteger.ZERO ;
			 i.compareTo(new BigInteger("8000000000")) < 0 ;
			 i = i.add(BigInteger.ONE)) {
			objArvore.inserir(i.doubleValue());
		}
		
		objArvore.imprimir();
	}
}