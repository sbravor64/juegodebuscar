package com.company;

import java.util.Scanner;

class Jugador {
    Scanner teclado = new Scanner(System.in);
    String nick;
    int fila, columna;

    void ponerNombre(){
        Scanner tec = new Scanner(System.in);
        System.out.print("NICK PARA JUGADOR: ");
        nick = tec.nextLine();
    }



    void introducirPosicion(){

        System.out.println(nick + " dime la posición que quieres atacar.");
        System.out.print("FILA: ");
        fila = teclado.nextInt() -1;
        System.out.print("COLUMNA: ");
        columna = teclado.nextInt()-1;

    }


}
