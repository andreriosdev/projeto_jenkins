package com.seuprojeto;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("2 + 2 = " + calc.somar(2, 2));

        Veiculo veiculo = new Veiculo();
        veiculo.setModelo("Fusca");
        System.out.println("Veículo: " + veiculo.getModelo());
    }
}
