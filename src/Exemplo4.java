import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0, entrada;
        for(int i=0; i < 8; i++){
            System.out.println("digite um numero");
            entrada = leitor.nextInt();
            leitor.nextLine();
            if(entrada % 2 == 0){
                soma = soma + entrada;
            }
        }
    }
}
