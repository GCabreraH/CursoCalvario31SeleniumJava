import java.util.Scanner;

public class Ejercicio22KcalSemana {
    public static void main(String[] args) {
        System.out.println("Ingrese el día de la semana del cual desea saber cuantos Kcal diario debe quemar");
        Scanner scanner = new Scanner(System.in);
        final var dia = ScannerManager.leerString(scanner, "Ingrese el día de la semana a consultar");
        final var Kcal = calcularKcal(dia);
        imprimirResultado(dia, Kcal);


    }

    static int calcularKcal(String dia) {
        final var Kcal = switch (dia) {
            case "Lunes", "lunes" -> 350;
            case "Martes", "martes" -> 420;
            case "Miercoles", "miercoles" -> 220;
            case "Jueves", "jueves" -> 600;
            case "Viernes", "viernes" -> 125;
            case "Sabado", "sabado" -> 250;
            case "Domingo", "domingo" -> 100;
            default -> -1;
        };
        return Kcal;
    }

    static void imprimirResultado(String dia, int Kcal) {
        if (Kcal != -1) {
            System.out.printf("Para el día %s se tienen que quemar %d calorías.", dia, Kcal);
        } else System.out.println("El día ingresado es incorrecto, debe ser un dia de lunes a domingo.");

    }


}
