import java.sql.SQLOutput;
import java.util.Scanner;

public class Calcular {

    public static void main(String[] args) {
        int idade1, idade2;
        double soma, media, altura;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a idade da primeira pessoa");
        idade1 = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite a idade da segunda pessoa");
        idade2 = leitura.nextInt();
        leitura.nextLine();

        soma = idade1 + idade2;
        media = soma / 2;
        System.out.println(soma);
        System.out.println(media);
    }
}
