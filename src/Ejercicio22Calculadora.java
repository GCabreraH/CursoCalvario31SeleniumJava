import java.util.Scanner;

public class Ejercicio22Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var int1 = ScannerManager.leerInt(scanner, "Ingrese el primer numero del calculo");
        final var int2 = ScannerManager.leerInt(scanner, "ingrese el segundo numero para el calculo por favor");
        imprimirMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Ingrese una opción del menú");
        scanner.close();
        ejecutarOpcion(opcion, int1, int2);


    }

    public static void imprimirMenu() {
        System.out.println("Opción A/a: Sumar");
        System.out.println("Opción B/b: Restar");
        System.out.println("Opción C/c: Multiplicar");
        System.out.println("Opción D/d: Dividir");
        System.out.println("Opción E/e: Resto");
        System.out.println("Opción Incorrecta");
    }

    static int sumar(int int1, int int2) {
        return int1 + int2;
    }

    static int restar(int int1, int int2) {
        return int1 - int2;
    }

    static int multiplicar(int int1, int int2) {
        return int1 * int2;
    }

    static int dividir(int int1, int int2) {
        return int1 / int2;
    }

    static int resto(int int1, int int2) {
        return int1 % int2;
    }

    static void ejecutarOpcion(char opcion, int int1, int int2) {
        final var resultado = switch (opcion) {
            case 'A', 'a' -> sumar(int1, int2);
            case 'B', 'b' -> restar(int1, int2);
            case 'C', 'c' -> multiplicar(int1, int2);
            case 'D', 'd' -> dividir(int1, int2);
            case 'E', 'e' -> resto(int1, int2);
            default -> -1;
        };
        if (resultado != -1) {
            System.out.printf("El resultado de calcular %d y %d es %d", int1, int2, resultado);
        } else System.out.println("La opción ingresada no es correcta.");
    }

}
