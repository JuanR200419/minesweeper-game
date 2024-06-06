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
public class Lista implements IList ,Serializable {

    private int size;
    private Nodo primero;
    private int maxSize;

    public Lista() {
        this.primero = null;
        this.size = 0;
    }

    //los metodos de add ------------------------------------------------
       @Override
    public void add(Mascota dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            this.primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.nodoSig != null) {
                aux = aux.nodoSig;
            }
            aux.nodoSig = nuevo;
        }
        size++;
    }
    
       @Override
    public void add(Mascota dato, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                primero.dato = dato;
            } else {
                Nodo aux = primero;
                int cont = 0;
                while (cont < index) {
                    aux = aux.nodoSig;
                    cont++;
                }
                aux.dato = dato;
            }
        }
        size++;
    }
    
        @Override
    public void addLimit(Mascota dato) {
        if (size >= maxSize) {
            throw new ArrayIndexOutOfBoundsException("La lista ha alcanzado su límite máximo");
        }
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            this.primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.nodoSig != null) {
                aux = aux.nodoSig;
            }
            aux.nodoSig = nuevo;
        }
        size++;
    }
    
    //---------------------------------------------------------
    
    @Override
    public Mascota get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                return primero.dato;
            } else {
                Nodo aux = primero;
                int cont = 0;
                while (cont < index) {
                    aux = aux.nodoSig;
                    cont++;
                }
                return aux.dato;
            }
        }
    }
    
 
    
    
 // metodos remove--------------------------------------------------------
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                primero = primero.nodoSig;
                size--;
            } else {
                Nodo ant = null;
                Nodo aux = primero;
                int cont = 0;
                while (cont < index) {
                    ant = aux;
                    aux = aux.nodoSig;
                    cont++;
                }
                ant.nodoSig = aux.nodoSig;
            }
        }
        size--;
    }
    
     public void remove(Mascota dato) {
        if (primero.dato.equals(dato)) {
            primero = primero.nodoSig;
        } else {
            Nodo ant = null;
            Nodo aux = primero;
            int cont = 0;
            while (!aux.dato.equals(dato) && cont < size) {
                ant = aux;
                aux = primero.nodoSig;
                cont++;
            }
            ant.nodoSig = aux.nodoSig;
        }
        size--;
    }
    
    
    // metodos del tamaño de la lista -------------------------------------------------------------------
    
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
   
    @Override
    public int setMaxSize(int numero) {
        return this.maxSize = numero;
    }
    // -------------------------------------------------------------------------

  
}
