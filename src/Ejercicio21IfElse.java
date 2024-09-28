import java.util.Random;
import java.util.Scanner;

public class Ejercicio21IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var numero = ScannerManager.leerInt(scanner, "Ingrese un numero del 1 al 6 por favor");
        scanner.close();
        final var estadoValidarNumero = validarNumero(numero);
        if (estadoValidarNumero) {
            Random random = new Random();
            final var aleatorio = RandomUtilities.generarRandomInt(1, 6, random);
            mostrarMensajeGanador(numero, aleatorio);
        } else {
            System.out.println("vuelva a intentarlo por favor.");
        }
    }

    static boolean validarNumero(int numero) {
        if (numero < 1 || numero > 6) {
            System.out.println("Número incorrecto. Ingrese un numero entre 1 y 6 por favor.");
            return false;
        } else {
            return true;
        }
    }

    static void mostrarMensajeGanador(int numero, int aleatorio) {
        if (numero == aleatorio) {
            System.out.printf("Ganaste! El numero %d ingresado corresponde con el numero aletatorio %d del dado.", numero, aleatorio);
        } else {
            System.out.printf("Perdiste! El numero %d ingresado no corresponde con el numero aletatorio %d del dado.", numero, aleatorio);
        }

    }

}
