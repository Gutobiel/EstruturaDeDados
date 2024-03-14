import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista objLista = new Lista();
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        // Processamento
        while (opcao != 4) {
            System.out.println("+===============+");
            System.out.println("| Menu de opção |");
            System.out.println("+===============+");
            System.out.println("|  1-Inserir    |");
            System.out.println("|  2-Remover    |");
            System.out.println("|  3-Apresentar |");
            System.out.println("|  4-Explodir   |");
            System.out.println("|  5-Sair       |");
            System.out.println("+===============+");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o numero: ");
                    objLista.inserir(leitor.nextInt());
                    break;
                case 2:
                    System.out.print("Digite o numero: ");
                    objLista.excluir(leitor.nextInt());
                    break; // Adicionado o break aqui
                case 3:
                    objLista.apresentar();
                    break;
                case 4:
                    for (int i = 0; i < 200000; i++) {
                        objLista.inserir(i);
                    }
                    break;
            }
        }
        leitor.close(); // Fechando o Scanner
    }
}
