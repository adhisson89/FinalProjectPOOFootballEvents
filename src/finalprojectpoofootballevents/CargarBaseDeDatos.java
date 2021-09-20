/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import poofootball.paneles.GUISistemaPartido;

/**
 *
 * @author Adhisson
 */
public class CargarBaseDeDatos {
    
    public static void llenarDatosPersonas() {
        
        try {
            
            FileInputStream fisPer = new FileInputStream("registroPersonas.txt");
            ObjectInputStream oisPer = new ObjectInputStream(fisPer);
            Persona p = (Persona) oisPer.readObject();
            GUISistemaPartido.listaPersonasRegistradas.add(p);
            while (p != null) {
                p = (Persona) oisPer.readObject();
                GUISistemaPartido.listaPersonasRegistradas.add(p);
            }
            oisPer.close();
            
        } catch (IOException ioe) {
            ioe.getStackTrace();
        } catch (ClassNotFoundException cnt) {
            cnt.getStackTrace();
        }
    }
    
    public static void llenarDatosPartidos() {
        
        try {

            FileInputStream fisPart = new FileInputStream("registroPartidos.txt");
            ObjectInputStream oisPart = new ObjectInputStream(fisPart);
            Partido pa = (Partido) oisPart.readObject();
            GUISistemaPartido.listaPartidosRegistrados.add(pa);
            while (pa != null) {
                pa = (Partido) oisPart.readObject();
                GUISistemaPartido.listaPartidosRegistrados.add(pa);
            }
            oisPart.close();
  
        } catch (IOException ioe) {
            ioe.getStackTrace();
        } catch (ClassNotFoundException cnt) {
            cnt.getStackTrace();
        }
    }
    
    public static void llenarDatosEquipos() {
        
        try {

            FileInputStream fisEqu = new FileInputStream("registroEquipos.txt");
            ObjectInputStream oisEqu = new ObjectInputStream(fisEqu);
            Equipo eq = (Equipo) oisEqu.readObject();
            GUISistemaPartido.listaEquiposRegistrados.add(eq);
            while (eq != null) {
                eq = (Equipo) oisEqu.readObject();
                GUISistemaPartido.listaEquiposRegistrados.add(eq);
            }
            oisEqu.close();

        } catch (IOException ioe) {
            ioe.getStackTrace();
        } catch (ClassNotFoundException cnt) {
            cnt.getStackTrace();
        }
    }
    
    public static void llenarDatosApuestas() {
        try {

            FileInputStream fisApu = new FileInputStream("registroApuestas.txt");
            ObjectInputStream oisApu = new ObjectInputStream(fisApu);
            Apuesta ap = (Apuesta) oisApu.readObject();
            GUISistemaPartido.listaApuestasRealizadas.add(ap);
            while (ap != null) {
                ap = (Apuesta) oisApu.readObject();
                GUISistemaPartido.listaApuestasRealizadas.add(ap);
            }
            oisApu.close();
            
        } catch (IOException ioe) {
            ioe.getStackTrace();
        } catch (ClassNotFoundException cnt) {
            cnt.getStackTrace();
        }
    }
    
    public static void llenarDatosEstadios() {
        
        try {

            FileInputStream fisEst = new FileInputStream("registroEstadios.txt");
            ObjectInputStream oisEst = new ObjectInputStream(fisEst);
            Estadio es = (Estadio) oisEst.readObject();
            GUISistemaPartido.listaEstadiosRegistrados.add(es);
            while (es != null) {
                es = (Estadio) oisEst.readObject();
                GUISistemaPartido.listaEstadiosRegistrados.add(es);
            }
            oisEst.close();

        } catch (IOException ioe) {
            ioe.getStackTrace();
        } catch (ClassNotFoundException cnt) {
            cnt.getStackTrace();
        }
    }
    
    public static void llenarDatosBoletos() {
        
        try {

            FileInputStream fisBol = new FileInputStream("registroBoletos.txt");
            ObjectInputStream oisBol = new ObjectInputStream(fisBol);
            Boleto bo = (Boleto) oisBol.readObject();
            GUISistemaPartido.listaBoletosVendidos.add(bo);
            while (bo != null) {
                bo = (Boleto) oisBol.readObject();
                GUISistemaPartido.listaBoletosVendidos.add(bo);
            }
            oisBol.close();
            
        } catch (IOException ioe) {
            ioe.getStackTrace();
        } catch (ClassNotFoundException cnt) {
            cnt.getStackTrace();
        }
    }
    
    
    
}
