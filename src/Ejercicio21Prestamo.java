import java.util.Scanner;

public class Ejercicio21Prestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scanner, "Ingrese el monto que desea solicitar");
        scanner.close();
        final var montoFinal = calcularMonto(montoInicial);
        imprimirResultado(montoInicial, montoFinal);

    }

    static double calcularMonto(double montoInicial) {
        final var a = (montoInicial % 2 == 0) ? montoInicial * 0.1 : 0;
        final var b = (montoInicial % 3 == 0) ? 500 : 0;
        final var c = (montoInicial > 500) ? 300 : 0;
        return montoInicial + a + b + c;

    }

    static void imprimirResultado(double montoInicial, double montoFinal) {
        System.out.printf("El monto inicial solicitado corresponde a %.2f %n El monto final a pagar es de %.2f", montoInicial, montoFinal);
    }

}
