import java.util.Scanner;
public class BasicoEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho dos vetores? ");
        int qtd = sc.nextInt();

        int[] vetor1 = new int[qtd];
        int[] vetor2 = new int[qtd];

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < qtd; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < qtd; i++) {
            vetor2[i] = sc.nextInt();
        }
        System.out.println("Soma dos valores:");
        for (int i = 0; i < qtd; i++) {
            int soma = vetor1[i] + vetor2[i];
            System.out.println("Posição " + i + ": " + soma);
        }
    }
}