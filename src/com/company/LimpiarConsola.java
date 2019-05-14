package com.company;

import java.io.IOException;

public class LimpiarConsola {

    void clear() {
        System.out.print("\033[H\033[2J");
    }

}
