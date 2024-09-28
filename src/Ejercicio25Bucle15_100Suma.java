import java.util.Random;

public class Ejercicio25Bucle15_100Suma {
    public static void main(String[] args) {

        final var n = RandomUtilities.generarRandomInt(15, 100, new Random());

        int suma1 = calcularSuma1(n);
        System.out.printf("El valor de n1 es: %d y la suma total de 1 hasta %d corresponde a: %d%n", n, n, suma1);
        int suma2 = calcularSuma2(n);
        System.out.printf("El valor de n2 es: %d y la suma de los impares de 1 hasta %d corresponde a: %d", n, n, suma2);
        int suma3 = calcularSuma3(n);
        System.out.printf("El valor de n3 es: %d y la suma de los multiples de 7 hasta %d corresponde a: %d", n, n, suma3);
    }

    static int calcularSuma1(int n) {
        var acumulador = 0;
        int i1 = 0;
        for (var i = 1; i <= n; i++) {
            System.out.println("acumulador: " + acumulador);
            System.out.println("i: " + i);
            i1 = acumulador += i;

        }
        return i1;
    }

    static int calcularSuma2(int n) {
        int acumulador = 0;
        int i2 = 0;
        for (var i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("acumulador: " + acumulador);
                System.out.println("i: " + i);
                i2 = acumulador += i;
            }

        }
        return i2;
    }

    static int calcularSuma3(int n) {
        int acumulador = 0;
        int i3 = 0;
        for (var i = 0; i < n; i++) {
            if (i % 5 == 0) {
                System.out.println("acumulador: " + acumulador);
                System.out.println("i: " + i);
                i3 += i;
            }

        }


        return i3;
    }


}
