package entregas.masiasManuel;

import java.util.Scanner;

public class Whacamole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_COLUMNAS = 4;
        final int NUMERO_FILAS = 4;
        final String CASILLA = "(  )";
        final String CASILLA_CON_MONIGOTE = "('')";
        final String CASILLA_CON_GOLPE = "[  ]";
        final String CASILLA_CON_GOLPE_MONIGOTE = "[**]";
        final int NUMERO_INTENTOS = 15;

        final int POSICIONES = NUMERO_COLUMNAS * NUMERO_FILAS;

        for (int intentos = 1; intentos <= NUMERO_INTENTOS; intentos++) {
            int posicionMonigote = (int) (Math.random() * POSICIONES) + 1;

            System.out.println("Adonde das el golpe? (1-16)?");
            int posicionUsuario = scanner.nextInt();

            int posicionActual = 0;
            for (int fila = 1; fila <= NUMERO_FILAS; fila++) {
                for (int columna = 1; columna <= NUMERO_COLUMNAS; columna++) {
                    posicionActual = posicionActual + 1;

                    if (posicionUsuario == posicionMonigote) {
                        System.out.print(CASILLA_CON_GOLPE_MONIGOTE);
                    } else if (posicionActual == posicionUsuario) {
                        System.out.print(CASILLA_CON_GOLPE);
                    } else if (posicionActual == posicionMonigote) {
                        System.out.print(CASILLA_CON_MONIGOTE);
                    } else {
                        System.out.print(CASILLA);
                    }
                }
                System.out.println();
            }
        }

    }
}
