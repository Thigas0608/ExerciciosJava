import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int palpite;
        int valorCorreto = 10000;

        System.out.println("Digite seu palpite: ");
        palpite = sc.nextInt();

        while (palpite != valorCorreto){
            if (palpite > valorCorreto){
                System.out.println("Um pouco mais...");
            }
            else{
                System.out.println("Um pouco mais...");
            }

            System.out.println("Digite outro palpite: ");
            palpite = sc.nextInt();
        }

        System.out.println("Fato!");
        sc.close();
    }
}
