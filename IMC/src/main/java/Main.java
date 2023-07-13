import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int peso;
        double altura;

        System.out.println("Digite peso seguido de altura: ");
        peso = sc.nextInt();
        altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f", imc);

        sc.close();
    }
}
