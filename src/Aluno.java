import java.util.Scanner;

public class Aluno{

    public static void main(String[] args){
        String nomeAluno;
        Scanner	entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        nomeAluno = entrada.nextLine();

        System.out.println("O aluno é "  + nomeAluno);



    }

}