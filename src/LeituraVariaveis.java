import java.util.Scanner;

public class LeituraVariaveis {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome1, nome2;

        System.out.println("Digite o primeiro nome");
        nome1 = leitor.nextLine();

        System.out.println("Digite o segundo nome");
        nome2 = leitor.nextLine();
        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("sao iguais");
        }else{
            System.out.println("NAO sao iguais");
        }
    }
}
