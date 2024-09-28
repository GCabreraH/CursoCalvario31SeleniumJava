public class EjercicioClaseWrapper2 {
    public static void main(String[] args) {
        final var cantidad1 = "23";
        final var cantidad2 = "5";
        final var cantidad3 = "111";
        final var precioTotal = calcularSuma(cantidad1, cantidad2, cantidad3);
        imprimirResultado(precioTotal);
    }

    static int calcularSuma(String cantidad1, String cantidad2, String cantidad3) {
        var a = Integer.parseInt(cantidad1);
        var b = Integer.parseInt(cantidad2);
        var c = Integer.parseInt(cantidad3);

        return a + b + c;
    }

    static void imprimirResultado(int precioTotal) {
        System.out.printf("La cantidad total es %d. ", precioTotal);
    }
}
