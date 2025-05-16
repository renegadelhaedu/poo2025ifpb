import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        int soma = 0, entrada;
        Scanner leitor = new Scanner(System.in);
        for (int x = 0; x < 5 ; x++){
            entrada = leitor.nextInt();
            leitor.nextLine();
            soma = soma + entrada;

        }
        System.out.println("a sua soma é: " + soma);
    }
}
