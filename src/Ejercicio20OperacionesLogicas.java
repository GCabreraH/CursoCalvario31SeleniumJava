import java.util.Random;

public class Ejercicio20OperacionesLogicas {
    public static void main(String[] args) {
        Random random = new Random();
        final var numero = RandomUtilities.generarRandomInt(10, 200, random);
        final var numero1 = calcularCondiciones1(numero);
        final var numero2 = calcularCondiciones2(numero);
        imprimirMensaje(numero, numero1, numero2);
    }

    static boolean calcularCondiciones1(int numero) {
        if (numero % 2 == 0 && numero > 50) {
            return true;
        }
        return false;
    }

    static boolean calcularCondiciones2(int numero) {
        if (numero % 3 == 0 || numero <= 35) {
            return true;
        }
        return false;
    }

    static void imprimirMensaje(int numero, boolean numero1, boolean numero2) {
        System.out.printf("El numero %d es par y mayor que 50? %b.%n", numero, numero1);
        System.out.printf("El numero %d es multiplo de 3 o es menor o igual que 35? %b.%n", numero, numero2);
    }

}
