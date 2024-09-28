import java.util.Random;

public class Ejercicio25Bucle15_100 {
    public static void main(String[] args) {
        var contador = 0;
        final var n = RandomUtilities.generarRandomInt(15, 100, new Random());
        contarValores1(n);
        contarValores2(n);
        contarValores3(n);
    }

    static int contarValores1(int n) {
        var contador = 0;

        for (var i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("par: " + i);
                contador++;
            }

        }
        System.out.println("Numero aleatorio es: " + n);
        System.out.println("contador: " + contador);
        return contador;
    }

    static int contarValores2(int n) {
        int contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
                System.out.println("los multiplos de 3 corresponden a:" + i);

            }
        }
        System.out.println("Total de multiplos de 3 es:" + contador);
        return contador;
    }

    static int contarValores3(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                contador++;
                System.out.println("El numero que termina en cero es:" + i);

            }
        }
        System.out.println("El total de numero terminados en cero es: " + contador);
        System.out.println("El numero n aleatorio es:" + n);
        return n;
    }
}
