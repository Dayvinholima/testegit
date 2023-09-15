import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Leia o número inteiro fornecido pelo usuário
        int numero = scanner.nextInt();

        // Verifique se o número é par ou ímpar e exiba a mensagem apropriada
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        // Feche o objeto Scanner
        scanner.close();
    }
}