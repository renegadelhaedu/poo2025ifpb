import java.util.Scanner;

public class Q12Lrepeticao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("digite um numero entre 1 e 10");
        num = ler.nextInt();
        ler.nextLine();

        for(int i=1; i <= 10; i++){
            System.out.println(num * i);
        }
    }
}
