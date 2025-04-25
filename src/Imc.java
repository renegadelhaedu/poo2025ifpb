import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        //declarar as variáveis
        double altura, peso, imc;

        Scanner leitor = new Scanner(System.in);
        System.out.println("digite sua altura");
        altura = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("digite seu peso");
        peso = leitor.nextDouble();
        leitor.nextLine();

        imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("abaixo do peso");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("peso dentro do normal");
        }else if(imc > 24.9 && imc <= 30){
            System.out.println("sobrepeso");
        }else{
            System.out.println("cuidar mais da saúde");
        }

    }
}
