package com.company;

import java.io.IOException;
import java.time.temporal.TemporalAccessor;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

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

        //BORRAR CONSOLA
        LimpiarConsola limpiar = new LimpiarConsola();
        //TIEMPO
        Tiempo time = new Tiempo();


        //Comienza el juego
        int fila,columna,filaColorRepetido,columnaColorRepetido;
        tablero.mostrar();
        while(true){

            do{
                jugador.introducirPosicion();
                fila=jugador.fila;
                columna=jugador.columna;
            }while(tablero.casillas[fila][columna]>8
                    || fila<0 || fila>4
                    || columna<0 || columna>4);

            tablero.comprobarCasilla(jugador);
            tablero.mostrar();

            do{
                jugador.introducirPosicion();
                filaColorRepetido=jugador.fila;
                columnaColorRepetido=jugador.columna;
            }while(tablero.casillas[filaColorRepetido][columnaColorRepetido]>8
                    || filaColorRepetido<0 || filaColorRepetido>4
                    || columnaColorRepetido<0 ||columnaColorRepetido>4);

            tablero.comprobarCasilla(jugador);
            tablero.mostrar();

            time.wait(2);
            limpiar.clear();

            if(tablero.casillas[fila][columna]==tablero.casillas[filaColorRepetido][columnaColorRepetido]
                    && fila!=filaColorRepetido && columna!=columnaColorRepetido){
                jugador.acierta();
                tablero.comprobarTotalColores();
                tablero.mostrar();
            } else {
                jugador.falla();
                tablero.quitarColoresNoAdivinados();
                tablero.mostrar();
            }

        }

    }
}
