import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void testInstanciaUnica() {
        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();
        assertSame(instancia1, instancia2);
    }
}
