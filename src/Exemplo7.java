import java.util.Scanner;

public class Exemplo7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, nomeIdoso = "";
        int idade, idadeIdoso = 0;

        for(int i=0;i < 5;i++){
            System.out.println("digite seu nome ");
            nome = ler.nextLine();
            System.out.println("digite sua idade");
            idade = ler.nextInt();
            ler.nextLine();
            if(idade > idadeIdoso){
                idadeIdoso = idade;
                nomeIdoso = nome;
            }
        }
        System.out.println("a pessoa mais velha em sala é " + nomeIdoso);
    }
}
