// ListaPontos.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListaPontos {
    private PontoDescarte head = null;

    public void inserir(String nome, String endereco, String tipoMaterial) {
        PontoDescarte novo = new PontoDescarte(nome, endereco, tipoMaterial);
        novo.prox = head;
        head = novo;
    }

    public void carregarDoArquivo(String tipoFiltrado) {
        try (BufferedReader br = new BufferedReader(new FileReader("pontos_de_descartes.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 3 && partes[2].trim().equalsIgnoreCase(tipoFiltrado)) {
                    inserir(partes[0].trim(), partes[1].trim(), partes[2].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void exibirLista() {
        PontoDescarte atual = head;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome);
            System.out.println("Endereço: " + atual.endereco);
            System.out.println("Tipo de Material: " + atual.tipoMaterial);
            System.out.println();
            atual = atual.prox;
        }
    }
}
