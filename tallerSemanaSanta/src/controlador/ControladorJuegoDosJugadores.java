/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import modelado.Bomba;

/**
 *
 * @author Juan Manuel
 */
public class ControladorJuegoDosJugadores {

    Bomba[][] bombas;
    int numMinas;
    int filas;
    int columnas;

    public ControladorJuegoDosJugadores(int filas, int columnas, int numMinas) {
        this.bombas = new Bomba[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
        this.numMinas = numMinas;
        initCasillas();
    }

    private void initCasillas() {
        for (int i = 0; i < bombas.length; i++) {
            for (int j = 0; j < bombas[i].length; j++) {
                bombas[i][j] = new Bomba();
            }
        }
        generarMinas();
    }

    public int getNumMinas() {
        return numMinas;
    }

    public Bomba obtenerBomba(int fila, int columna) {
        return bombas[fila][columna];
    }

    public void generarMinas() {

        int cantidadCasillas = bombas.length * bombas[0].length;
        int minasRequeridas = (cantidadCasillas / (9 + numMinas * 2)); // minas requeridas para equilibrar el juego 
        if (minasRequeridas > numMinas) {
            numMinas = minasRequeridas;
            JOptionPane.showMessageDialog(null, "Se aumentara el numero de minas a " + numMinas + " para equilibrar el juego ");
        }
        int minasGeneradas = 0;
        while (minasGeneradas != numMinas) {
            int fila = (int) (Math.random() * bombas.length);
            int columna = (int) (Math.random() * bombas[0].length);
            if (!bombas[fila][columna].isMinas()) {
                bombas[fila][columna].setMinas(true);
                minasGeneradas++;
            }
        }
    }

    private int validar(int jugadorUno, int jugadorDos, int numBombasRestantes) {
        int mitad = 0;
        // si el numero Total de bobas es impar 
        if (numMinas % 2 != 0) {
            mitad = (numMinas + 1) / 2;
            if (jugadorUno >= mitad) {
                return 0; // Jugador  Dos Gana
            } else if (jugadorDos >= mitad) {
                return 1; // Jugador Uno gana
            }

        } else {
            mitad = numMinas / 2;
            if (jugadorUno > mitad) {
                return 0; // Jugador  Dos Gana
            } else if (jugadorDos > mitad) {
                return 1; // Jugador Uno gana
            }
            if (numBombasRestantes == 0) {
                if ( jugadorUno == jugadorDos) {
                    return 2; // Empate
                }
            }
        }

        return -1;
    }

    public String validarGanador(int jugadorUno, int jugadorDos, int numBombas) {
        int resultado = validar(jugadorUno, jugadorDos, numBombas);
        switch (resultado) {
            case 0:
                return "¡Jugador Dos gana!";
            case 1:
                return "¡Jugador Uno gana!";

            case 2:
                return "¡Empate!";
            default:
                break;
        }
        return "";
    }
}
