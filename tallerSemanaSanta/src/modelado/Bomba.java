/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

/**
 *
 * @author Juan Manuel
 */
public class Bomba {

    public static final String ABIERTA = "abierta";
    public static final String SINABRIR = "sinAbrir";
    private boolean minas;
    String estado;
    public Bomba() {
        this.estado=SINABRIR;
        this.minas=false;
    }
    
    public boolean isMinas() {
        return minas;
    }

    public void setMinas(boolean minas) {
        this.minas = minas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
