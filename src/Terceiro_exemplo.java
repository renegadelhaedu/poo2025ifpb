import java.util.Scanner;

public class Terceiro_exemplo {

    public static void main(String[] args) {
        //declaração de variáveis
        int idade;
        double altura;
        String nome;
        boolean aprovado;

        //declarando um scanner para ler valores do usuário
        Scanner leitor = new Scanner(System.in);

        idade = 36;
        altura = 1.7;
        nome = "rene de sousa";
        aprovado = false;

        if(nome.equalsIgnoreCase("livia")){
            System.out.println("tudo ok");
        }else if(idade > 15 && altura > 1.52){
            System.out.println("tudo ok");
        }else if (aprovado == true && altura > 1.45) {
            System.out.println("tudo ok");
        }else{
            System.out.println("NAO tudo ok");
        }

    }
}


