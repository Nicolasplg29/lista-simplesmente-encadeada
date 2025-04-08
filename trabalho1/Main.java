// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaPontos lista = new ListaPontos();

        System.out.print("Digite o tipo de material a ser filtrado: ");
        String tipo = sc.nextLine();

        lista.carregarDoArquivo(tipo);

        System.out.println("\nPontos de descarte para '" + tipo + "':\n");
        lista.exibirLista();

        sc.close();
    }
}
