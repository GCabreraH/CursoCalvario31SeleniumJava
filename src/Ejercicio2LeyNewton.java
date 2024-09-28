import java.util.Random;

public class Ejercicio2LeyNewton {
    public static void main(String[] args) {
        Random random = new Random();
        final var masa = RandomUtilities.generarRandomDouble(3.5, 5, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(100, 300, random);
        final var fuerza = calcularFuerza(masa, aceleracion);
        imprimirResultado(masa, aceleracion, fuerza);
    }

    public static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    public static void imprimirResultado(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa de %.4f y aceleración %.4f tenemos una fuerza de %.4f.", masa, aceleracion, fuerza);
    }
}
