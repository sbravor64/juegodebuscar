package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tablero {

    Random random = new Random();
    int[][] casillas = {{1,1,2,2},{3,3,4,4},{5,5,6,6},{7,7,8,8}};
    char casillasO[][] = new char[4][4];
    int f,c;
    int cont=1;

    void desordenar(){
        for (int i = 0; i <casillas.length ; i++) {
            int posAleatoriaI = random.nextInt(casillas.length);
            for (int j = 0; j <casillas.length ; j++) {
                int posAleatoriaJ = random.nextInt(casillas.length);
                int numero = casillas[i][j];
                casillas[i][j] = casillas[posAleatoriaI][posAleatoriaJ];
                casillas[posAleatoriaI][posAleatoriaJ] = numero;
            }
        }

        for (int i = 0; i <casillas.length ; i++) {
            for (int j = 0; j <casillas.length ; j++) {
                System.out.print(casillas[i][j]);
            }
            System.out.println();
        }
    }

    void mostrarTablero(){
        for (int i = 0; i <casillas.length ; i++) {
            for (int j = 0; j <casillas.length ; j++) {
                if(casillas[i][j]==1){
                    System.out.print("\033[34m*\033[0m");
                } else if(casillas[i][j]==2){
                    System.out.print("\033[31m*\033[0m");
                } else if(casillas[i][j]==3){
                    System.out.print("\033[32m*\033[0m");
                } else if(casillas[i][j]==4){
                    System.out.print("\033[37m*\033[0m");
                } else if(casillas[i][j]==5){
                    System.out.print("\033[33m*\033[0m");
                } else if(casillas[i][j]==6){
                    System.out.print("\033[30m*\033[0m");
                } else if(casillas[i][j]==7){
                    System.out.print("\033[36m*\033[0m");
                } else if(casillas[i][j]==8){
                    System.out.print("\033[35m*\033[0m");
                }
            }
            System.out.println();
        }
    }

    void verCasilla(Jugador jugador){
        if(casillas[jugador.fila][jugador.columna] == 1){
            System.out.print("\033[34m*\033[0m");
        }
        else if(casillas[jugador.fila][jugador.columna]==2){
            System.out.print("\033[31m*\033[0m");
        } else if(casillas[jugador.fila][jugador.columna]==3){
            System.out.print("\033[32m*\033[0m");
        } else if(casillas[jugador.fila][jugador.columna]==4){
            System.out.print("\033[37m*\033[0m");
        } else if(casillas[jugador.fila][jugador.columna]==5){
            System.out.print("\033[33m*\033[0m");
        } else if(casillas[jugador.fila][jugador.columna]==6){
            System.out.print("\033[30m*\033[0m");
        } else if(casillas[jugador.fila][jugador.columna]==7){
            System.out.print("\033[36m*\033[0m");
        } else if(casillas[jugador.fila][jugador.columna]==8){
            System.out.print("\033[35m*\033[0m");
        }
    }

}
