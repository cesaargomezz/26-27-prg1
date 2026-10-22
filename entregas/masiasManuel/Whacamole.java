package entregas.masiasManuel;

import java.util.Scanner;

public class Whacamole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_COLUMNAS = 6;
        final int NUMERO_FILAS = 6;
        final String CASILLA = "(  )";
        final String CASILLA_CON_MONIGOTE = "('')";
        final String CASILLA_CON_GOLPE = "[  ]";
        final String CASILLA_CON_GOLPE_MONIGOTE = "[**]";
        final int NUMERO_INTENTOS = 15;

        final int POSICIONES = NUMERO_COLUMNAS * NUMERO_FILAS;
        int tamañoLado = (int) Math.sqrt(POSICIONES);
        int numeroDeAciertos = 0;

        for (int intentos = 1; intentos <= NUMERO_INTENTOS; intentos++) {
            int posicionMonigote = (int) (Math.random() * POSICIONES) + 1;

            System.out.println("Adonde das el golpe? (" + posicionMonigote + ")?");
            int posicionUsuario = scanner.nextInt();

            for (int posicion = 1; posicion <= POSICIONES; posicion++) {

                if (posicionUsuario == posicionMonigote && posicion == posicionUsuario) {
                    System.out.print(CASILLA_CON_GOLPE_MONIGOTE);
                    numeroDeAciertos++;
                } else if (posicion == posicionUsuario) {
                    System.out.print(CASILLA_CON_GOLPE);
                } else if (posicion == posicionMonigote) {
                    System.out.print(CASILLA_CON_MONIGOTE);
                } else {
                    System.out.print(CASILLA);
                }
                if (posicion % tamañoLado == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("Has logrado " + numeroDeAciertos + " aciertos");
    }

}
