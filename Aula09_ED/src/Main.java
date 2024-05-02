public class Main {
    public static void main(String[] args) {
        Arvore objArvore = new Arvore();

        for (int i = 0; i < 10; i++) {
            objArvore.inserir(i);
        }

        objArvore.desenharArvore();
        objArvore.navegarPreOrdem();
        objArvore.navegarEmOrdem();
        objArvore.navegarPosOrdem();
    }
}