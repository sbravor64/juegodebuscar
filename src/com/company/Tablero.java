package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tablero {
    Colores colores = new Colores();
    Random random = new Random();
    int[][] casillas = {{1,1,2,2},{3,3,4,4},{5,5,6,6},{7,7,8,8}};
    int numeroColores, numeroTotalColores;
    int colorBlue, colorRed, colorBlack, colorCyan, colorGreen, colorPurple, colorWhite, colorYellow;

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

        System.out.println("-----");
    }

    void mostrar(){
        for (int i = 0; i <casillas.length ; i++) {
            for (int j = 0; j <casillas.length ; j++) {
                if(casillas[i][j]==11){
                    System.out.print(colores.BLUE + "*" + colores.RESET);
                    numeroColores++;
                } else if(casillas[i][j]==22){
                    System.out.print(colores.RED + "*" + colores.RESET);
                    numeroColores++;
                } else if(casillas[i][j]==33){
                    System.out.print(colores.BLACK + "*" + colores.RESET);
                    numeroColores++;
                } else if(casillas[i][j]==44){
                    System.out.print(colores.CYAN + "*" + colores.RESET);
                    numeroColores++;
                } else if(casillas[i][j]==55){
                    System.out.print(colores.GREEN + "*" + colores.RESET);
                    numeroColores++;
                } else if(casillas[i][j]==66){
                    System.out.print(colores.PURPLE + "*" + colores.RESET);
                    numeroColores++;
                } else if(casillas[i][j]==77){
                    System.out.print(colores.WHITE + "*" + colores.RESET);
                    numeroColores++;
                } else if(casillas[i][j]==88){
                    System.out.print(colores.YELLOW + "*" + colores.RESET);
                    numeroColores++;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    void comprobarCasilla(Jugador jugador){
        if(casillas[jugador.fila][jugador.columna] == 1){
            casillas[jugador.fila][jugador.columna] = 11;
        }
        else if(casillas[jugador.fila][jugador.columna]==2){
            casillas[jugador.fila][jugador.columna] = 22;
        } else if(casillas[jugador.fila][jugador.columna]==3){
            casillas[jugador.fila][jugador.columna] = 33;
        } else if(casillas[jugador.fila][jugador.columna]==4){
            casillas[jugador.fila][jugador.columna] = 44;
        } else if(casillas[jugador.fila][jugador.columna]==5){
            casillas[jugador.fila][jugador.columna] = 55;
        } else if(casillas[jugador.fila][jugador.columna]==6){
            casillas[jugador.fila][jugador.columna] = 66;
        } else if(casillas[jugador.fila][jugador.columna]==7){
            casillas[jugador.fila][jugador.columna] = 77;
        } else if(casillas[jugador.fila][jugador.columna]==8){
            casillas[jugador.fila][jugador.columna] = 88;
        }
    }

    void quitarColoresNoAdivinados() {

        for (int i = 0; i <casillas.length ; i++) {
            for (int j = 0; j <casillas[i].length ; j++) {
                if(casillas[i][j]==11){
                    colorBlue++;
                } else if(casillas[i][j]==22){
                    colorRed++;
                } else if(casillas[i][j]==33){
                    colorBlack++;
                } else if(casillas[i][j]==44){
                    colorCyan++;
                } else if(casillas[i][j]==55){
                    colorGreen++;
                } else if(casillas[i][j]==66){
                    colorPurple++;
                } else if(casillas[i][j]==77){
                    colorWhite++;
                } else if(casillas[i][j]==88){
                    colorYellow++;
                }
            }
        }

        for (int i = 0; i <casillas.length ; i++) {
            for (int j = 0; j <casillas[i].length ; j++) {
                if(casillas[i][j]==11){
                    if(colorBlue<2){
                        casillas[i][j]=1;
                        colorBlue=0;
                    }
                } else if(casillas[i][j]==22){
                    if(colorRed<2){
                        casillas[i][j]=2;
                        colorRed=0;
                    }
                } else if(casillas[i][j]==33){
                    if(colorBlack<2){
                        casillas[i][j]=3;
                        colorBlack=0;
                    }
                } else if(casillas[i][j]==44){
                    if(colorCyan<2){
                        casillas[i][j]=4;
                        colorCyan=0;
                    }
                } else if(casillas[i][j]==55){
                    if(colorGreen<2){
                        casillas[i][j]=5;
                        colorGreen=0;
                    }
                } else if(casillas[i][j]==66){
                    if(colorPurple<2){
                        casillas[i][j]=6;
                        colorPurple=0;
                    }
                } else if(casillas[i][j]==77){
                    if(colorWhite<2){
                        casillas[i][j]=7;
                        colorWhite=0;
                    }
                } else if(casillas[i][j]==88){
                    if(colorYellow<2){
                        casillas[i][j]=8;
                        colorYellow=0;
                    }
                }
            }
        }
    }



    void comprobarTotalColores(){
        if(numeroColores==numeroTotalColores){
            System.out.println();
            System.out.println();
            System.out.println("---------------");
            System.out.println("¡¡FELICIDADES!!");
            System.out.print("HAS GANADO ");
        }
    }

}
