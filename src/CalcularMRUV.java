import java.util.Random;

public class CalcularMRUV {
    public static void main(String[] args) {
        Random random = new Random();
        final var velocidadInicial = RandomUtilities.generarRandomDouble(10.50, 30.55, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(2.5, 5.5, random);
        final var tiempo = RandomUtilities.generarRandomInt(3, 5, random);
        final var vF = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
        imprimirResultado(vF, velocidadInicial, aceleracion, tiempo);
    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + (aceleracion * tiempo);
    }

    public static void imprimirResultado(double vF, double velocidadInicial, double aceleracion, int tiempo) {
        System.out.printf("Para una velocidad inicial %.3f, una aceleracion %.4f y un tiempo %d. Se tiene una velocidad final de %.4f usando MRUV.", velocidadInicial, aceleracion, tiempo, vF);
    }


}
