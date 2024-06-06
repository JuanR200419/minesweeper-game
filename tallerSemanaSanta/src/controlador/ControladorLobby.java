/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import execepciones.camposVaciosException;
import execepciones.cantidadDeBombasException;
import execepciones.cantidadDeCasillasException;
import execepciones.numeroInvalidoException;

/**
 *
 * @author Juan Manuel
 */
public class ControladorLobby {

    public ControladorLobby() {
    }

    public void validarCamposVacios(String fila, String columna, String bombas) throws camposVaciosException {
        if (fila.isEmpty() || columna.isEmpty() || bombas.isEmpty()) {
            throw new camposVaciosException();
        }
    }

    public void validarNumeros(int fila, int columna, int bombas) throws numeroInvalidoException {
        if (fila <= 0 || columna <= 0 || bombas <= 0) {
            throw new numeroInvalidoException();
        }
    }

    public void validarBombasTotales(int fila, int columna, int bombas) throws cantidadDeBombasException, cantidadDeCasillasException, numeroInvalidoException {
            validarNumeros(fila, columna, bombas);
        if ((fila * columna) < bombas) {
            throw new cantidadDeBombasException();
        }
    }

    public void validarCasillas(int fila, int columna, int bombas) throws cantidadDeCasillasException {
        if ((fila * columna) == bombas) {
            throw new cantidadDeCasillasException();
        }

    }
}
