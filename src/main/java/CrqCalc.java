import java.util.Scanner;

public class CrqCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        System.out.println("Escolha a operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão):");
        int operacao = scanner.nextInt();
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }
}
