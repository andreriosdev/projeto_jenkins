public class CalculadoraComRepeticao {
    public int somarRepetido(int a, int b, int repeticoes) {
        int resultado = 0;
        for (int i = 0; i < repeticoes; i++) {
            resultado += a + b;
        }
        return resultado;
    }

    public double dividirRepetido(double a, double b, int repeticoes) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        double resultado = a;
        for (int i = 0; i < repeticoes; i++) {
            resultado /= b;
        }
        return resultado;
    }
}
