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

        System.out.println(nick + ", escribe la posición");
        System.out.print("FILA: ");
        fila = teclado.nextInt() -1;
        System.out.print("COLUMNA: ");
        columna = teclado.nextInt()-1;

    }

    void acierta(){
        System.out.println();
        System.out.println("¡HAS ACERTADO!");
        System.out.println("Sigue intentandolo hasta conseguir todos los colores");
    }

    void falla(){
        System.out.println();
        System.out.println("¡HAS FALLADO!");
        System.out.println("Sigue intentandolo hasta conseguir todos los colores");
    }


}
