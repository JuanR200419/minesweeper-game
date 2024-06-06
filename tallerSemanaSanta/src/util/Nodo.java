/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;
import modelado.Mascota;

/**
 *
 * @author Juan Manuel
 */
public class Nodo  implements Serializable{

    public Mascota dato;
    public Nodo nodoSig;

    public Nodo(Mascota dato) {
        this.dato = dato;
        this.nodoSig = null;
    }

}
