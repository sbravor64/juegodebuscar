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
        while(true){
            System.out.println("hola");
            tablero.mostrar();
            do {
                jugador.introducirPosicion();
                tablero.comprobarCasilla(jugador);
                tablero.mostrar();
                jugador.introducirPosicionColorRepetido();
                tablero.comprobarCasillaRepetida(jugador);
                tablero.mostrar();

                // guardar las posiciones del primer intento y del segundo.
                intento1=tablero.casillas[jugador.fila][jugador.columna];
                intento2=tablero.casillas[jugador.filaColorRepetido][jugador.columnaColorRepetido];

            } while(intento1==intento2);

            tablero.quitarColoresNoAdivinados();
        }

    }
}
