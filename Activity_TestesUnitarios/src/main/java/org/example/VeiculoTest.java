package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VeiculoTest {
    public VeiculoTest() {
    }

    @Test
    public void testCalculoSemDesconto() {
        Veiculo v = new Veiculo("Parati", (double)55.5F);
        Assertions.assertEquals((double)166.5, v.calcularCusto(3));
    }

    @Test
    public void testCalculoComDesconto() {
        Veiculo v = new Veiculo("Fusca", (double)122.0F);
        Assertions.assertEquals(768.6, v.calcularCusto(7));
    }

    @Test
    public void testDesconto() {
        Veiculo v = new Veiculo("Mustang", (double)355.5F);
        Assertions.assertEquals((double)0.0F, v.desconto(5));
        Assertions.assertEquals(248.85, v.desconto(7), 0.0001);
    }

    @Test
    public void testMultaPorAtraso() {
        Veiculo v = new Veiculo("Ferrari", (double)444.0F);
        Assertions.assertEquals((double)666.0F, v.calcularMulta(1));
        Assertions.assertEquals((double)0.0F, v.calcularMulta(0));
    }

    @Test
    public void testDiasInvalidos() {
        Veiculo v = new Veiculo("Opala", (double)200.0F);
        Assertions.assertThrows(IllegalArgumentException.class, () -> v.calcularCusto(0));
    }

    @Test
    public void testValorDiariaNegativa() {
        Veiculo v = new Veiculo("BMW x1", (double)-355.0F);
        Assertions.assertThrows(IllegalArgumentException.class, () -> v.calcularCusto(5));
    }
}