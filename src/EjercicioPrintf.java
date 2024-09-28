public class EjercicioPrintf {
    public static void main(String[] args) {
        final var numeroGatos = 3;
        final var peso = 13.3;
        final var libroFavorito = "hola mundo 123";
        final var esBajo = false;
        final var inicial = 'v';

        System.out.printf("hola tengo %d gatos %n %.2f es mi peso %n mi libro favorito es %s y lo leo todas las noches %n mi inicial es %c%n si me preguntan si soy bajo pues la respuesta es %b.", numeroGatos, peso, libroFavorito, inicial, esBajo);


    }

}
