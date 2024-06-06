/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelado.Jaula;
import modelado.Mascota;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Serializador {
    private static Serializador INTANCIA = new Serializador();
    Jaula[][] jaulas;
    int record;
    private Serializador() {
        this.jaulas= leerJaulas();
        this.record =leerRecord();
        
    }

       public static Serializador getINTANCIA() {
        return INTANCIA;
    }
    
    public Jaula[][] getJaulas() {
        return jaulas;
    }

    public int getRecord() {
        return record;
    }

       public void escribirJaula() {
        try {
            FileOutputStream archivo = new FileOutputStream("Perros.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(jaulas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Jaula[][] leerJaulas() {
        try {
            FileInputStream archivo = new FileInputStream("Perros.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Jaula[][]) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Jaula[4][4];
        }
    }
    
      public void escribirRecord(int record) {
        try {
            FileOutputStream archivo = new FileOutputStream("Record.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(record);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public int leerRecord() {
        try {
            FileInputStream archivo = new FileInputStream("Record.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return 0;
        }
    }
    
    
}
