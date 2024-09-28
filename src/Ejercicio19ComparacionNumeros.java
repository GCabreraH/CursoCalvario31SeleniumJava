import java.util.Scanner;

public class Ejercicio19ComparacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var a = ScannerManager.leerInt(scanner, "Ingrese un numero entero por favor");
        final var esPar = esPar(a);
        final var multiplo5 = esMultiplo5(a);
        imprimirResultado(a, esPar, multiplo5);

    }

    static boolean esPar(int a) {
        return a % 2 == 0;
    }

    static boolean esMultiplo5(int a) {
        return a % 5 == 0;
    }

    static void imprimirResultado(int numero, boolean esPar, boolean multiplo5) {
        System.out.printf("El numero %d es par? %b.%n", numero, esPar);
        System.out.printf("El numero %d es multiplo de 5? %b. %n", numero, multiplo5);


    }
}
