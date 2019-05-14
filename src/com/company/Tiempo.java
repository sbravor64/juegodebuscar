package com.company;

import java.util.concurrent.TimeUnit;

public class Tiempo {

    public static void wait(int n) {

        try {
            TimeUnit.SECONDS.sleep(n);
        } catch(InterruptedException ex) {
            // Do something
        }
    }


}
