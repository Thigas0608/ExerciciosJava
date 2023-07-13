import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        int quantidade;
        String nome;

        System.out.println("Digite a quantidade de nomes: ");
        quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){
            nome = sc.next();
            listaNomes.add(nome);
        }

        for (int i = quantidade -1; i >= 0; i--){
            System.out.println(listaNomes.get(i));
        }

        sc.close();
    }
}
