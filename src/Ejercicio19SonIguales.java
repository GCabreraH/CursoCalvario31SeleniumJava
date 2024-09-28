import java.util.Scanner;

public class Ejercicio19SonIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var a = ScannerManager.leerInt(scanner, "Ingrese un numero entero por favor");
        final var b = ScannerManager.leerInt(scanner, "Ingrese un numero entero por favor");
        scanner.close();
        final var sonIguales = sonIguales(a, b);
        imprimirResultado(a, b, sonIguales);
    }

    static boolean sonIguales(int a, int b) {
        return a == b;

    }

    static void imprimirResultado(int a, int b, boolean sonIguales) {
        System.out.printf("El numero %d es igual a %d? %b.", a, b, sonIguales);
    }
}
