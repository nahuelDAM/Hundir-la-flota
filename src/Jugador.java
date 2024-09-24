import java.util.Scanner;

public class Jugador {
    private int tablero[][];
    private String nombre;
    private int puntuacion;

    public Jugador(int[][] tablero, String nombre, int puntuacion) {
        this.tablero = tablero;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
