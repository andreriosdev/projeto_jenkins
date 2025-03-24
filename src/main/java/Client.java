// Interface Prototype
interface Prototype {
    Prototype clone();
}

// Classe ConcretePrototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public String getName() {
        return name;
    }
}

// Classe Cliente
public class Client {
    public static void main(String[] args) {
        // Cria um protótipo
        ConcretePrototype prototype = new ConcretePrototype("Original");

        // Clona o protótipo
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        // Verifica se os objetos são diferentes, mas têm o mesmo conteúdo
        System.out.println("Prototype: " + prototype.getName());
        System.out.println("Clone: " + clone.getName());
        System.out.println("São o mesmo objeto? " + (prototype == clone));
    }
}
