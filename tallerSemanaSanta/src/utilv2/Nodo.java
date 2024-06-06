/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilv2;

import java.io.Serializable;

/**
 *
 * @author Juan Manuel
 */
public class Nodo<T> implements Serializable {

    T dato;
    Nodo<T> nodoSig;

    public Nodo(T dato) {
        this.dato = dato;
        this.nodoSig = null;
    }

}
