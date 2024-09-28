public class EjercicoMatematicos1 {
    public static void main(String[] args) {
        final var velocidadInicial = 15.24;
        final var aceleracion = 3.75;
        final var tiempo = 5;
        final var velocidadFinal = velocidadFinal(velocidadInicial, aceleracion, tiempo);
        System.out.printf("Para una velocidad inicial %.3f, una aceleración %.3f y un tiempo %d.%n se tiene una velocidad final %.3f usando MRUV.", velocidadInicial, aceleracion, tiempo, velocidadFinal);


    }


    public static double velocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        double vel = velocidadInicial + (aceleracion * tiempo);
        return vel;
    }

}
