import java.util.Random;

public class Ejercicio25Bucle {
    public static void main(String[] args) {
        Random random = new Random();
        final var n = RandomUtilities.generarRandomInt(5, 20, random);
        System.out.println("El valor de n es:" + n);
        mostrarNumeros1(n);
        mostrarNumeros2(n);
        mostrarNumeros3(n);
    }

    static void mostrarNumeros1(int n) {
        for (var i = 0; i < n; i++) {
            if (i == 0) {

            } else System.out.println("mostrarNumeros1:" + i);
        }
    }

    static void mostrarNumeros2(int n) {
        for (var i = 0; i < n; i++) {
            if (i == 0) {

            } else if (i % 2 != 0) {
                System.out.println("Impares: " + i);
            }
        }
    }

    static void mostrarNumeros3(int n) {
        for (var i = 0; i < n; n--) {
            System.out.println("Decreciendo desde" + n + "es:" + n);
        }
    }
}
