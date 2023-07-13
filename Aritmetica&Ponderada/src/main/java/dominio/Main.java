package dominio;

public class Main {

    public static void main(String[] args){

        Notas conta = new Notas();

        conta.nota1 = 10f;
        conta.nota2 = 7f;
        conta.nota3 = 8f;

        float resultado = conta.aritmetica();
        System.out.println("Aritmetica " + resultado);

        resultado = conta.ponderada();
        System.out.println("Ponderada: " + resultado);
    }
}
