public class EjerciciosMatematicos2 {
    public static void main(String[] args) {
        final var masa = 76.1265;
        final var aceleracion = 100.5032;
        final var f = fuerza(masa, aceleracion);
        System.out.printf("Para una masa de %.4f y aceleracion %.4f, tenemos una fuerza de %77f", masa, aceleracion, f);

    }

    public static double fuerza(double masa, double aceleracion) {
        return masa * aceleracion;

    }
}
