/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.io.Serializable;

/**
 *
 * @author Juan Manuel
 */
public class Mascota implements Serializable{
    private String nombre;
    private String raza;
    private String codigo;
    public static final String MACHO = "Macho";
    public static final String HEMBRA = "Hembra";
    String genero;

    public Mascota(String nombre, String raza, String codigo, String genero) {
        this.nombre = nombre;
        this.raza = raza;
        this.codigo = codigo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
