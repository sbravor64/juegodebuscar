package com.company;

public class Main {

    public static void main(String[] args) {

        // Mensaje de Binvenida
        Instrucciones instrucciones = new Instrucciones();
        instrucciones.mostrar();

        // creación de Jugador de jugadores
        Jugador jugador = new Jugador();
        jugador.ponerNombre();

        // Creación del dibujo (casillas) para el juego
        Tablero tablero  = new Tablero();

        tablero.desordenar();
        //tablero.añadirColoresIguales();

        //Comienza el juego
        jugador.introducirPosicion();
        tablero.verCasilla(jugador);
    }
}
