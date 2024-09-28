import java.util.Scanner;

public class Ejercicio21CondicionesPrestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scanner, "Ingrese el monto de su solicitud de préstamo");
        final var montoFinal = calcularMonto(montoInicial);
        imprimirResultado(montoInicial, montoFinal);
    }

    static double calcularMonto(double montoInicial) {
        if (montoInicial > 500) {
            return montoInicial + 300;
        } else if (montoInicial % 2 == 0) {
            return montoInicial * 1.1;
        } else if (montoInicial % 3 == 0) {
            return montoInicial + 500;
        }
        return 0;
    }

    static void imprimirResultado(double montoInicial, double montoFinal) {
        System.out.printf("Para el prestamo inicial: %.2f se le cobrará en total: %.2f al final", montoInicial, montoFinal);
    }
}
