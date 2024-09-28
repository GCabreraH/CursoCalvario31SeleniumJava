public class EjercicioMatematicos3 {
    public static void main(String[] args) {
        final var cateto1 = 55.12;
        final var cateto2 = 23.12;
        final var hipotenusa = carlcularHipotenusa(cateto1, cateto2);

        System.out.printf("Para los catetos %.3f y %.3f tenemos la hipotenusa %.3f", cateto1, cateto2, hipotenusa);

    }

    public static double carlcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
    }
}
