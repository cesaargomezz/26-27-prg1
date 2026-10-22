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
            int posicionMonigote1 = (int) (Math.random() * POSICIONES) + 1;
            int posicionMonigote2 = (int) (Math.random() * POSICIONES) + 1;

            System.out.println("Adonde das el golpe? (" + posicionMonigote1 + ","+posicionMonigote2+")?");
            int posicionUsuario = scanner.nextInt();

            for (int posicion = 1; posicion <= POSICIONES; posicion++) {

                boolean hayUsuario = posicion == posicionUsuario;
                boolean hayMonigote = posicion == posicionMonigote1 || posicion == posicionMonigote2;

                boolean haAcertado = hayMonigote && hayUsuario;

                String queImprimir = CASILLA;
                if (haAcertado && posicion == posicionUsuario) {
                    queImprimir = CASILLA_CON_GOLPE_MONIGOTE;
                    numeroDeAciertos++;
                } else if (hayUsuario) {
                    queImprimir = CASILLA_CON_GOLPE;
                } else if (hayMonigote) {
                    queImprimir = CASILLA_CON_MONIGOTE;
                }
                System.out.print(queImprimir);

                if (posicion % tamañoLado == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("Has logrado " + numeroDeAciertos + " aciertos");
    }

}
