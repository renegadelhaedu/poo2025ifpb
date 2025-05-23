import java.util.Scanner;

public class Q8Lrepeticao {
    public static void main(String[] args) {
        int soma = 0;
        Scanner leitor = new Scanner(System.in);
        for(int i=7; i<12; i++){
            System.out.println("digite um numero ");
            int numero = leitor.nextInt();
            leitor.nextLine();
            soma = soma + numero;

        }
        double media = soma / 5.0;
        System.out.println("soma foi " + soma);
        System.out.println("media foi " + media);

    }
}
