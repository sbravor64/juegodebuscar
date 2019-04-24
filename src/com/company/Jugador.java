package com.company;

import java.util.Scanner;

class Jugador {
    Scanner teclado = new Scanner(System.in);
    String nick;
    int fila, columna;
    int filaColorRepetido, columnaColorRepetido;

    void ponerNombre(){
        Scanner tec = new Scanner(System.in);
        System.out.print("NICK PARA JUGADOR: ");
        nick = tec.nextLine();
    }



    void introducirPosicion(){

        System.out.println(nick + ", escribe la posición del color que quieres adivinar");
        System.out.print("FILA: ");
        fila = teclado.nextInt() -1;
        System.out.print("COLUMNA: ");
        columna = teclado.nextInt()-1;

    }

    void introducirPosicionColorRepetido(){

        System.out.println(nick + ", intenta adivinar en que posición se encuentra el color");
        System.out.print("FILA: ");
        filaColorRepetido = teclado.nextInt() -1;
        System.out.print("COLUMNA: ");
        columnaColorRepetido = teclado.nextInt()-1;

    }


}
