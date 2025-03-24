import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscritaArquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "teste.txt"; // Nome do arquivo
        String conteudo = "Olá, mundo!\nSegunda linha."; // Conteúdo a ser gravado

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write(conteudo); // Escreve no arquivo
            System.out.println("Arquivo criado e conteúdo gravado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
