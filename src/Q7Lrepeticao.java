import java.util.Scanner;

public class Q7Lrepeticao {
    public static void main(String[] args) {
        int maior = 0;
        Scanner leitor = new Scanner(System.in);
        for(int i=7; i<12; i++){
            System.out.println("digite um numero ");
            int numero = leitor.nextInt();
            leitor.nextLine();
            if(numero > maior){
                maior = numero;
            }
        }
        System.out.println(maior);

    }
}
