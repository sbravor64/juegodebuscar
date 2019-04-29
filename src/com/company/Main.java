package com.company;

public class Main {

    public static void main(String[] args) {

        // Mensaje de Binvenida
        Instrucciones instrucciones = new Instrucciones();
        instrucciones.mostrar();

        // creación de Jugador
        Jugador jugador = new Jugador();
        jugador.ponerNombre();

        // Creación del dibujo (casillas) para el juego
        Tablero tablero  = new Tablero();

        tablero.desordenar();
        //tablero.añadirColoresIguales();

        //Comienza el juego

        int intento1,intento2;
        tablero.mostrar();
        while(true){

            jugador.introducirPosicion();
            int fila=jugador.fila;
            int columna=jugador.columna;

            tablero.comprobarCasilla(jugador);
            tablero.mostrar();

            jugador.introducirPosicion();
            int filaColorRepetido=jugador.fila;
            int columnaColorRepetido=jugador.columna;

            tablero.comprobarCasilla(jugador);
            tablero.mostrar();

            if(tablero.casillas[fila][columna]==tablero.casillas[filaColorRepetido][columnaColorRepetido]){
                jugador.acierta();
                tablero.comprobarTotalColores();
            } else {
                jugador.falla();
                tablero.quitarColoresNoAdivinados();
                tablero.mostrar();
            }

        }

    }
}
