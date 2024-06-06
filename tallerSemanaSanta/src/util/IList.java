/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

import modelado.Mascota;

/**
 *
 * @author Juan Manuel
 */
public interface IList  {
    /**
     * creando los metodos para listas enlazadas
     * @param dato 
     */
    public void add(Mascota dato);
    public Mascota  get(int index);
    public void add(Mascota  dato,int index);
    public void remove(int index);
    public void remove(Mascota dato);
    public int size();
    public boolean isEmpty();
    public int setMaxSize(int numero);
    public void addLimit(Mascota dato);
}
