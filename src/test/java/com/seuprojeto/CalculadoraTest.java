package com.seuprojeto;  // Adicione esta linha

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(4, calc.somar(2, 2));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(4, 2));
        assertThrows(ArithmeticException.class, () -> calc.dividir(1, 0));
    }
}
