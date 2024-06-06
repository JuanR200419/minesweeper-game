/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import execepciones.numeroInvalidoException;
import javax.swing.JOptionPane;
import modelado.Bomba;

/**
 *
 * @author Juan Manuel
 */
public class ControladorJuegoSolitario {

    Bomba[][] bombas;
    int record;
    int numMinas;
    int filas;
    int columnas;

    public ControladorJuegoSolitario(int filas, int columnas, int numMinas) {
        this.bombas = new Bomba[filas][columnas];
        this.record = Serializador.Serializador.getINTANCIA().leerRecord();
        this.numMinas = numMinas;
        this.filas = filas;
        this.columnas = columnas;
        initCasillas();

    }

    private void initCasillas()  {
        // colocar exceptiones para que solo puedan ser matrices cuadradas y que tengan mas de una fila y columna
        for (int i = 0; i < bombas.length; i++) {
            for (int j = 0; j < bombas[i].length; j++) {
                bombas[i][j] = new Bomba();
            }
        }
        generarMinas();
    }

  public void generarMinas(){
     
    int cantidadCasillas = bombas.length * bombas[0].length;
    int minasRequeridas = (cantidadCasillas / (9 + numMinas * 2)); // minas requeridas para equilibrar el juego 
    if (minasRequeridas > numMinas) {
        numMinas = minasRequeridas;
        JOptionPane.showMessageDialog(null, "Se aumentara el numero de minas a "+numMinas+" para equilibrar el juego ");        
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
    public int getRecord() {
        return record;
    }

    public void puntajeRecord(int puntajeActual) {
        if (puntajeActual > this.record) {
            this.record = puntajeActual;
            Serializador.Serializador.getINTANCIA().escribirRecord(record);
        }
    }

    public Bomba obtenerBomba(int fila, int columna) {
        return bombas[fila][columna];
    }

    public int getNumMinas() {
        return numMinas;
    }

}
