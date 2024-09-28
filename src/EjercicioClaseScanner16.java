import java.util.Scanner;

public class EjercicioClaseScanner16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var nombre = ScannerManager.leerString(scanner, "Ingrese su nombre por favor");


        final var edad = ScannerManager.leerInt(scanner, "Ingrese su edad por favor");

        final var estatura = ScannerManager.leerDouble(scanner, "Ingese su estatura por favor");
        scanner.nextLine();
        imprimirResultado(edad, estatura);

    }

    static void imprimirResultado(int edad, double estatura) {
        System.out.printf("Tu edad es %d y tu estatura es %.2f metros", edad, estatura);
    }
}
