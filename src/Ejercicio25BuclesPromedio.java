import java.util.Random;

public class Ejercicio25BuclesPromedio {
    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(5, 20, new Random());
        int promedio = calcularPromedioSimple(n);
        imprimirResultado(n, promedio);

    }

    public static int calcularPromedioSimple(int n) {
        int suma = 0;
        int contador = 0;
        for (var i = 1; i <= n; i++) {
            suma += i;

        }

        return suma / n;
    }

    public static void imprimirResultado(int n, int promedio) {
        System.out.printf("El promedio simple desde 1 hasta %d es %d", n, promedio);
    }
}
