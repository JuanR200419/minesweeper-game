/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelado.Jaula;

/**
 *
 * @author Juan Manuel
 */
public class ControladorInicial {
    
    Jaula[][]jaulas;
    
    
    public ControladorInicial() {
        this.jaulas = Serializador.Serializador.getINTANCIA().getJaulas();
        initJaulas();
    }
    
     private void initJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            for (int j = 0; j < jaulas[i].length; j++) {
                if (jaulas[i][j] == null) {
                    jaulas[i][j] = new Jaula();
                }
            }
        }
    }
    
    public Jaula obtenerLocal(int fila, int columna) {
        return jaulas[fila][columna];
    }
}
