public class Carro {
    // Atributos
    public String marca;
    public int portas;
    
    // Métodos
    public void buzinar() {
        System.out.println("Bibi!");
    }
    
    public String abrirPortas() {
        return "Portas abertas!";
    }
    
    // Método toString para representação textual
    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", portas=" + portas + "]";
    }
}
