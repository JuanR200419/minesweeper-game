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
public class Lista<T> implements IList<T> , Serializable {

    private int size;
    private Nodo<T> primero;

    public Lista() {
        this.primero = null;
        this.size = 0;
    }

    @Override
    public void add(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            this.primero = nuevo;
        } else {
            Nodo<T> aux = primero;
            while (aux.nodoSig != null) {
                aux = aux.nodoSig;
            }
            aux.nodoSig = nuevo;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                return primero.dato;
            } else {
                Nodo<T> aux = primero;
                int cont = 0;
                while (cont < index) {
                    aux = aux.nodoSig;
                    cont++;
                }
                return aux.dato;
            }
        }
    }

    @Override
    public void add(T dato, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                primero.dato = dato;
            } else {
                Nodo<T> aux = primero;
                int cont = 0;
                while (cont < index) {
                    aux = aux.nodoSig;
                    cont++;
                }
                aux.dato = dato;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                primero = primero.nodoSig;
                size--;
            } else {
                Nodo<T> ant = null;
                Nodo<T> aux = primero;
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

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void remove(T dato) {
        if (primero.dato.equals(dato)) {
            primero = primero.nodoSig;
        } else {
            Nodo <T>ant = null;
            Nodo <T>aux = primero;
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
}
