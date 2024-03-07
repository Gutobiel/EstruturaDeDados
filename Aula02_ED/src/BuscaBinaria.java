import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[200000000]; // Este tamanho de vetor é extremamente grande, o que pode causar problemas de desempenho e de alocação de memória.

        int busca = 0;
        int achei = -1; // Inicialize com -1 para indicar que o elemento não foi encontrado
        int inicio = 0;
        int fim = vetor.length - 1; // Subtraia 1 para a última posição do vetor
        int meio = 0;

        // Criação ordenada do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        do {
            System.out.println("Digite o valor a ser buscado (ou -99 para sair): ");
            busca = leitor.nextInt();

            // Busca propriamente dita
            inicio = 0;
            fim = vetor.length - 1;
            achei = -1; // Resetar o valor de achei para -1 a cada iteração do loop
            while (fim >= inicio) {
                meio = (inicio + fim) / 2;

                if (vetor[meio] == busca) {
                    achei = meio;
                    break; // Encerrar o loop assim que o elemento for encontrado
                } else if (vetor[meio] > busca) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }

            if (achei == -1) {
                System.out.println("Não achei!");
            } else {
                System.out.println("Achei! Na posição " + achei);
            }
        } while (busca != -99);

        leitor.close();
    }
}
