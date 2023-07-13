package dominio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Menu cardapio = new Menu();


        int codigo;
        int escolha = 0;
        String pedido = null;
        double valor = 0.00;
        double valorTotal = 0.00;


        cardapio.info();

        while(true){
            System.out.print("Entre com o código desejado: ");
            codigo = sc.nextInt();

            if(codigo == 100){
                pedido = "Cachorro Quente";
                valor = 9.0;
            } else if(codigo == 101){
                pedido = "Cachorro Quente Duplo";
                valor = 11.00;
            }else if(codigo == 102){
                pedido = "X-Egg";
                valor = 12.00;
            }else if(codigo == 103){
                pedido = "X-Salada";
                valor = 12.00;
            }else if(codigo == 104){
                pedido = "X-Bacon";
                valor = 14.00;
            }else if(codigo == 105){
                pedido = "X-Tudo";
                valor = 17.00;
            }else if(codigo == 200){
                pedido = "Refrigerante em Lata";
                valor = 5.00;
            }else if(codigo == 201){
                pedido = "Chá Gelado";
                valor = 4.00;
            }
            else{
                System.out.println("Opção inválida");
            }

            valorTotal += valor;
            System.out.println("Você pediu um "+ pedido +" no valor de R$"+ valor);

            System.out.println("Deseja pedir mais alguma coisa ? \n1 - Sim \n0 - Não >>");
            escolha = sc.nextInt();
            if(escolha == 0){
                System.out.println("Saindo do menu de pedido");
                break;
            }
        }

        System.out.println("O valor total a ser pago é: "+ valorTotal);
    }
}








