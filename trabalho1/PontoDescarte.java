// PontoDescarte.java
public class PontoDescarte {
    String nome;
    String endereco;
    String tipoMaterial;
    PontoDescarte prox;

    public PontoDescarte(String nome, String endereco, String tipoMaterial) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipoMaterial = tipoMaterial;
        this.prox = null;
    }
}
