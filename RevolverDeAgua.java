/*

 */

package Entidades;

/*
 * REL 02
 * Santiago Chiconi, Date: 6/6/2023
 */
/*random.nextInt(5) + 1*/

import java.util.Random;

public class RevolverDeAgua {
    Random random = new Random();

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }



    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void llenarRevolver() {
        setPosicionAgua(random.nextInt(5+1));
        setPosicionActual(random.nextInt(5+1));
        System.out.println("Posicion Agua: " + getPosicionAgua());
        System.out.println("Posicion Actual: " + getPosicionActual());
    }

    public boolean mojar() {
        boolean mojar = false;
        if (posicionActual == posicionAgua) {
            mojar = true;
        }
        return mojar;
    }

    public int siguienteChorro() {
        if (getPosicionActual() == 5) {
            setPosicionActual(1);
        } else {
            setPosicionActual(getPosicionActual() + 1);
        }
        return getPosicionActual();
    }

    @Override
    public String toString() {
        return "RevolverDeAgua---" +
                " posicionActual = " + posicionActual +
                ", posicionAgua = " + posicionAgua +
                '}';
    }
}