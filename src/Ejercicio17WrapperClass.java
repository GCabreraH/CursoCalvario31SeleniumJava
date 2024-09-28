public class Ejercicio17WrapperClass {
    public static void main(String[] args) {
        final var precio1 = "45.50";
        final var precio2 = "32.20";
        final var precio3 = "75.12";
        final var precioTotal = calcularSuma(precio1, precio2, precio3);
        imprimirSuma(precioTotal);
    }

    static double calcularSuma(String precio1, String precio2, String precio3) {
        var a = Double.parseDouble(precio1);
        var b = Double.parseDouble(precio2);
        var c = Double.parseDouble(precio3);

        return a + b + c;
    }

    static void imprimirSuma(double precioTotal) {
        System.out.printf("El precio total es %.2f.", precioTotal);
    }

}
