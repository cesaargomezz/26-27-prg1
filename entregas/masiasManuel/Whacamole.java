package entregas.masiasManuel;

import java.util.Scanner;

public class Whacamole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_COLUMNAS = 4;
        final int NUMERO_FILAS = 4;
        final String CASILLA_SIN_MONIGOTE = "[ ]";

        for (int fila = 0; fila < NUMERO_FILAS; fila++) {
            for (int columna = 0; columna < NUMERO_COLUMNAS; columna++) {
                System.out.print(CASILLA_SIN_MONIGOTE);
            }
            System.out.println();
        }

    }
}
