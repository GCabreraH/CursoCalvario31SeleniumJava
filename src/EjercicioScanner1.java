import java.util.Scanner;

public class EjercicioScanner1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad por favor y presione Enter: ");
        final var edad = scanner.nextInt();
        System.out.print("Ingrese su estatura en metros con coma para decimales y presione Enter: ");
        final var estatura = scanner.nextDouble();
        scanner.nextLine();//se agrega este salto de linea despues de emplear nextInt para limpiar el buffer y que tome el siguiente dato.
        System.out.print("Ingrese su nombre por favor: ");
        final var nombre = scanner.nextLine();

        scanner.close();
        imprimirResultado(edad, estatura, nombre);


    }

    static void imprimirResultado(int edad, double estatura, String nombre) {
        System.out.printf("Buenas tardes %s su edad corresponde a: %d años y su estatura es de: %.2f metros.", nombre, edad, estatura);
    }

}