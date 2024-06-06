/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execepciones;

/**
 *
 * @author Juan Manuel
 */
public class perroExistenteException extends Exception {

    public perroExistenteException() {
    super("Este perro ya esta ubicado en una Jaula");
    }
    
}
