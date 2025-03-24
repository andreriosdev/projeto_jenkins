public class Singleton {
    // Instância única da classe
    private static Singleton instance;

    // Construtor privado para impedir a criação de instâncias externas
    private Singleton() {
        System.out.println("Instância Singleton criada.");
    }

    // Método público para acessar a instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Outros métodos da classe
    public void doSomething() {
        System.out.println("Fazendo algo...");
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Obtém a instância única
        Singleton singleton = Singleton.getInstance();

        // Chama um método da instância
        singleton.doSomething();

        // Tenta criar outra instância (não será possível)
        Singleton anotherSingleton = Singleton.getInstance();

        // Verifica se as duas variáveis apontam para a mesma instância
        if (singleton == anotherSingleton) {
            System.out.println("As duas variáveis apontam para a mesma instância.");
        } else {
            System.out.println("As variáveis apontam para instâncias diferentes.");
        }
    }
}
