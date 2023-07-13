package dominio;

public class Carro {

 public String nome;
 public String modelo;
 public float velocidade;

    public float milhasParaMetros(float milhas){
        return milhas*1600;
    }

}
