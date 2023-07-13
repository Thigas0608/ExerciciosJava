package domain;
public class Conta {

    // Variaveis da Classe = ATRIBUTOS:
    String correntista;
    float saldo;
    float limiteSaque;


    //METODOS  | Parametro
    void sacar(float valor){
        if(valor > saldo || valor > limiteSaque){
            System.out.println("Saque não permitido");
        }else{
            saldo -= valor;
        }
    }

    void depositar( float valor){
        saldo += valor;
    }

    void transferir(Conta depositar, float valor){
        if (valor > saldo || valor > limiteSaque){
            System.out.println("Transferencia não permitida!");
        }else{
            saldo -= valor;
            depositar.saldo += valor;
        }
    }

    void info(){
        System.out.println("Nome: " + correntista);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limiteSaque);
    }
}

