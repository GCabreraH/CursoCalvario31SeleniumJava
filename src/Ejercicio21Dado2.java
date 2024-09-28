import java.util.Random;
import java.util.Scanner;

public class Ejercicio21Dado2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var numero = ScannerManager.leerInt(scanner, "ingrese un numero del 1 al 6 por favor");
        scanner.close();
        final var random2 = validarNumero(numero);
        Random random = new Random();
        final var aleatorio = RandomUtilities.generarRandomInt(1, 6, random);
        if (random2) {
            mostrarMensajeGanador(numero, aleatorio);
        }

    }

    public static boolean validarNumero(int numero) {
        if (numero < 1 || numero > 6) {
            System.out.println("Número no válido, intentelo nuevamente por favor.");
            return false;
        }
        return true;
    }


    public static void mostrarMensajeGanador(int numero, int aleatorio) {
        if (numero == aleatorio) {
            System.out.printf("El numero %d es igual al numero %d creado aleatoriamente, ganaste!!", numero, aleatorio);
        } else {
            System.out.printf("El numero %d es NO igual al numero %d creado aleatoriamente, perdiste!!", numero, aleatorio);

        }
    }
}
