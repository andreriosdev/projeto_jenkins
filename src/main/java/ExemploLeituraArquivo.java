import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeituraArquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "teste.txt"; // Mesmo arquivo criado anteriormente

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            System.out.println("Conteúdo do arquivo:");
            while ((linha = reader.readLine()) != null) { // Lê linha por linha
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
