/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import execepciones.SoloHembrasExcepcion;
import execepciones.jaulaLlenaException;
import execepciones.noCambioGeneroException;
import execepciones.noseEncuentraElperroException;
import execepciones.soloMachosException;
import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Jaula implements Serializable {

    public static final String VACIA = "Vacias";
    public static final String UNPUESTO = "UnPuesto";
    public static final String LLENA = "Llena";
    private String estado;
    Lista listaMascotas;
    private int cantidadMax;

    public Jaula() {
        this.estado = VACIA;
        listaMascotas = new Lista();
        this.cantidadMax = 3;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public void guardarMascota(Mascota masco) throws jaulaLlenaException, soloMachosException, SoloHembrasExcepcion {
        if (listaMascotas.size() == 3) {
            this.estado = LLENA;
            throw new jaulaLlenaException();
        }
        int validacion = validarGenero();
        Mascota mascota = buscarMascota(masco.getCodigo());
        switch (validacion) {
            case 1:
                if (!masco.genero.equals(Mascota.MACHO)) {
                    throw new soloMachosException();
                }
                if (mascota == null) {
                    listaMascotas.add(masco);
                }
                break;
            case 2:
                if (!masco.genero.equals(Mascota.HEMBRA)) {
                    throw new SoloHembrasExcepcion();
                }
                if (mascota == null) {
                    listaMascotas.add(masco);
                }
                break;
            case 0:
                if (mascota == null) {
                    listaMascotas.add(masco);
                }
                break;
            default:
                break;
        }
    }

    public Mascota buscarMascota(String id) {
        for (int i = 0; i < listaMascotas.size(); i++) {
            if (listaMascotas.get(i).getCodigo().equals(id)) {
                return listaMascotas.get(i);
            }
        }
        return null;
    }

    public void borrarMascota(String id) throws noseEncuentraElperroException {
        Mascota masco = buscarMascota(id);
        if (masco != null) {
            listaMascotas.remove(masco);
        } else {
            throw new noseEncuentraElperroException();
        }
    }

    public void actualizarMascota(Mascota mascota) throws noseEncuentraElperroException,noCambioGeneroException {
        Mascota masco = buscarMascota(mascota.getCodigo());
        if (masco != null) {
            if(masco.getGenero().equals(mascota.getGenero())){
            masco.setNombre(mascota.getNombre());
            masco.setRaza(mascota.getRaza());
            }else{
            throw new noCambioGeneroException();
            }
        } else {
            throw new noseEncuentraElperroException();
        }

    }

    public Lista getListaMascotas() {
        return listaMascotas;
    }

    private int validarGenero() {
        for (int i = 0; i < listaMascotas.size(); i++) {
            if (listaMascotas.get(i).getGenero().equals(Mascota.MACHO)) {
                return 1;
            } else if (listaMascotas.get(i).getGenero().equals(Mascota.HEMBRA)) {
                return 2;
            }
        }
        return 0;
    }

    public void validarUnpuesto() {
        if (listaMascotas.size() == 2) {
            this.estado = UNPUESTO;
        }
    }

    public void validarListaLlena() {
        if (listaMascotas.size() == 3) {
            this.estado = LLENA;
        }
    }

    public void validarListaVacia() {
        if (listaMascotas.size() == 1) {
            this.estado = VACIA;
        }
    }

}
