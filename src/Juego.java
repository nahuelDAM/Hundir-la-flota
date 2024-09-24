import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private List<Jugador> jugadores = new ArrayList<>();

    public void iniciarPartida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del jugador 1: ");
        jugadores.add(new Jugador(rellenarTablero(), sc.next(), 0));
        System.out.println("Nombre del jugador 2: ");
        jugadores.add(new Jugador(rellenarTablero(), sc.next(), 0));
    }

    private int[][] rellenarTablero() {
        int tablero[][] = new int[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        return tablero;
    }
}
