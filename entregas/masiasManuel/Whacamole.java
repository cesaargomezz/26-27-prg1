package entregas.masiasManuel;
import java.util.Scanner;

public class Whacamole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUMERO_COLUMNAS = 4;
        final int NUMERO_FILAS = 4;

        for (int j=0;j<NUMERO_FILAS;j++){
            for(int i=0;i<NUMERO_COLUMNAS;i++){
                System.out.print("[ ]");
            }
            System.out.println();
        }


    }
}
