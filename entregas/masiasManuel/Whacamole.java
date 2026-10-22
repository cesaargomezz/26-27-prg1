package entregas.masiasManuel;

import java.util.Scanner;

public class Whacamole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_COLUMNAS = 4;
        final int NUMERO_FILAS = 4;
        final String CASILLA_SIN_MONIGOTE = "(  )";
        final String CASILLA_CON_MONIGOTE = "('')";

        final int POSICIONES = NUMERO_COLUMNAS * NUMERO_FILAS;

        int posicionMonigote = (int) (Math.random() * POSICIONES) + 1;

        int posicionActual = 0;
        for (int fila = 1; fila <= NUMERO_FILAS; fila++) {
            for (int columna = 1; columna <= NUMERO_COLUMNAS; columna++) {
                posicionActual = posicionActual + 1;

                System.out.print(posicionActual==posicionMonigote?CASILLA_CON_MONIGOTE:CASILLA_SIN_MONIGOTE);
                
            }
            System.out.println();
        }

    }
}
