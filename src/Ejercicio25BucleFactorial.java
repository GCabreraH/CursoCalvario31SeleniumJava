import java.util.Random;

public class Ejercicio25BucleFactorial {
    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(2, 10, new Random());
        imprimirResultado(n, calcularFactorial(n));
    }

    static int calcularFactorial(int n) {
        int factorial = 1;
        for (var i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void imprimirResultado(int n, int factorial) {
        System.out.printf("El factorial de %d es %d", n, factorial);
    }
}
