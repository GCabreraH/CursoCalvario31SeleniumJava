import java.util.Random;
import java.util.Scanner;

public class Ejercicio18AumentoDecrementoNumeros {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        var teclado = ScannerManager.leerInt(scanner, "Ingrese un numero por favor");
        teclado++;
        System.out.println(teclado);
        Random random = new Random();
        var n = RandomUtilities.generarRandomInt(3, 10, random);
        System.out.println(n + ": es ene sola.");
        System.out.println(teclado + ": Es teclado solo");
        teclado += n;
        System.out.println(teclado + "es teclado aumentado");
    }

}
