import java.util.Scanner;

public class Q10Lrepeticao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inicio, fim;

        System.out.println("digite o primeiro");
        inicio = ler.nextInt();
        ler.nextLine();

        System.out.println("digite o ultimo");
        fim = ler.nextInt();
        ler.nextLine();

        for(int i=inicio + 1; i < fim; i++){
            System.out.println(i);
        }
    }
}
