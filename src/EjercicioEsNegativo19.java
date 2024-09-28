import java.util.Random;

public class EjercicioEsNegativo19 {
    public static void main(String[] args) {
        Random random = new Random();
        final var a = RandomUtilities.generarRandomInt(-100, 100, random);
        final var b = RandomUtilities.generarRandomInt(20, 100, random);
        imprimirResultado(a, esNegativo(a));
        imprimirResultado(b, esNegativo(b));
    }

    static boolean esNegativo(int numero) {
        return numero < 0;
    }

    static void imprimirResultado(int numero, boolean resultado) {
        System.out.printf("El numero %d es negativo? %b.%n", numero, resultado);
    }
}