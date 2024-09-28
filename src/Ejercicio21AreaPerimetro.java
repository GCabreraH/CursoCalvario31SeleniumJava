import java.util.Scanner;

public class Ejercicio21AreaPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var radio = ScannerManager.leerDouble(scanner, "Ingrese el radio por favor");
        imprimirMenu();
        final var menu = ScannerManager.leerChar(scanner, "ingrese la opción seleccionada");
        validarInput(menu, radio);
    }

    static void imprimirMenu() {
        System.out.println("Seleccione las siguientes opciones de menu:");
        System.out.println("Opcion A: Calcular el área.");
        System.out.println("Opcion B: Calcular el perímetro.");
        System.out.println("Opcion C: Calcular área y perímetro.");
    }

    static boolean validarInput(char menu, double radio) {
        if (menu == 'A' || menu == 'a') {
            System.out.printf("El radio %.2f se relaciona a un area de círculo: %.2f", radio, calcularArea(radio));
            return true;
        } else if (menu == 'B' || menu == 'b') {
            System.out.printf("El radio %.2f se relaciona a un perimetro de círculo: %.2f", radio, calcularPerimetro(radio));
            return true;
        } else if (menu == 'C' || menu == 'c') {
            System.out.printf("El radio %.2f se relaciona a un área de %.2f y a un perimetro de círculo: %.2f", radio, calcularArea(radio), calcularPerimetro(radio));
            return true;
        }
        throw new IllegalArgumentException("La opción ingresada no es correcta.");

    }

    static double calcularArea(double radio) {
        return (Math.PI * (Math.pow(radio, 2)));
    }

    static double calcularPerimetro(double radio) {
        return (2 * Math.PI * radio);
    }
}
