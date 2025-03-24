package com.seuprojeto;  // Adicione esta linha

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {
    @Test
    void testVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo("Fusca");
        assertEquals("Fusca", veiculo.getModelo());
    }
}
