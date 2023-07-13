package domain;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();


        conta1.correntista = "Thiago";
        conta1.saldo = 15000;
        conta1.limiteSaque = 100000;

        conta2.correntista = "Renato";
        conta2.saldo = 14000;
        conta2.limiteSaque = 90000;


        conta2.transferir(conta1, 1000);

        conta1.info();
        System.out.println();
        conta2.info();
    }
}
