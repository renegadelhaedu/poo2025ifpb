import java.util.Scanner;

public class Respostas {
    public static void main(String[] args) {
        String r1,r2;
        int contagem = 0;
        String nome_aluno;


        //cria uma cópia da classe Scanner
        Scanner ler = new Scanner(System.in);

        System.out.println("você gosta de dormir à tarde?");
        //usando a classe Scanner para receber entrada do usuário
        r1 = ler.nextLine();

        System.out.println("você escova o cabelo toda semana?");
        r2 = ler.nextLine();

        if(r1.equalsIgnoreCase("sim")){
            contagem++;
        }
        if(r2.equalsIgnoreCase("sim")){
            contagem++;
        }
        
        System.out.println("a quantidade de afirmativas foi " + contagem);

    }
}
