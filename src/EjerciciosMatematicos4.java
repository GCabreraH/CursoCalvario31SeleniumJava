import java.util.Random;

public class EjerciciosMatematicos4 {
    public static void main(String[] args) {
        final var max = 100;
        final var min = 20;
        final var random = new Random();
        final var radio = random.nextInt(max - min + 1) + min;


        final var area = calcularArea(radio);
        final var perimetro = calcularPerimetro(radio);
        System.out.printf("Para mostrar un radio de %d se tiene un perimetro de %.3f y un área de %.3f", radio, perimetro, area);

    }

    public static double calcularArea(int radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static double calcularPerimetro(int radio) {
        return 2 * Math.PI * radio;
    }

}
