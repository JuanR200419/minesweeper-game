/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import execepciones.SoloHembrasExcepcion;
import execepciones.camposVaciosException;
import execepciones.jaulaLlenaException;
import execepciones.noCambioGeneroException;
import execepciones.noseEncuentraElperroException;
import execepciones.perroExistenteException;
import execepciones.soloMachosException;
import java.awt.List;
import modelado.Jaula;
import modelado.Mascota;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class ControladorGestionMascotas {

    Jaula jaula;
    Jaula[][] listaJaulas;

    public ControladorGestionMascotas(Jaula jaula) {
        this.jaula = jaula;
        this.listaJaulas = Serializador.Serializador.getINTANCIA().getJaulas();
    }

    public void guardarMascota(Mascota masco) throws jaulaLlenaException, soloMachosException, SoloHembrasExcepcion, perroExistenteException,camposVaciosException {
        Mascota mascotaCreada = validarUnicoPerro(masco.getCodigo());
        if (mascotaCreada == null) {
            camposVacios(masco);
            jaula.guardarMascota(masco);
            Serializador.Serializador.getINTANCIA().escribirJaula();
        } else {
            throw new perroExistenteException();
        }
    }

    public void borrarMascota(String id) throws noseEncuentraElperroException,camposVaciosException {
        if(id.isEmpty()){
        throw new camposVaciosException();
        }
        jaula.borrarMascota(id);
        Serializador.Serializador.getINTANCIA().escribirJaula();
    }

    public Mascota buscarMascota(String id)throws camposVaciosException{
          if(id.isEmpty()){
        throw new camposVaciosException();
        }
        return jaula.buscarMascota(id);
    }

    public void actualizarMascota(Mascota mascota) throws noseEncuentraElperroException, noCambioGeneroException, camposVaciosException {
        camposVacios(mascota);
        jaula.actualizarMascota(mascota);
        Serializador.Serializador.getINTANCIA().escribirJaula();
    }

    public void validarUnpuesto() {
        jaula.validarUnpuesto();
          Serializador.Serializador.getINTANCIA().escribirJaula();
    }

    private Mascota validarUnicoPerro(String id) {
        for (int i = 0; i < listaJaulas.length; i++) {
            for (int j = 0; j < listaJaulas[i].length; j++) {
                for (int k = 0; k < listaJaulas[i][j].getListaMascotas().size(); k++) {
                    if (listaJaulas[i][j].getListaMascotas().get(k).getCodigo().equals(id)) {
                        return listaJaulas[i][j].getListaMascotas().get(k);
                    }
                }
            }

        }
        return null;
    }
    
    public void camposVacios(Mascota masco) throws camposVaciosException{
        if(masco.getNombre().isEmpty()||masco.getRaza().isEmpty()||masco.getCodigo().isEmpty()){
            throw new camposVaciosException();
        }
    }
    
     public void validarListaLlena() {
     jaula.validarListaLlena();
       Serializador.Serializador.getINTANCIA().escribirJaula();
     }

    public Lista getListaMascota() {
        return jaula.getListaMascotas();
    }
     
       public void validarListaVacia() {
     jaula.validarListaVacia();
       Serializador.Serializador.getINTANCIA().escribirJaula();
     }

     
}
